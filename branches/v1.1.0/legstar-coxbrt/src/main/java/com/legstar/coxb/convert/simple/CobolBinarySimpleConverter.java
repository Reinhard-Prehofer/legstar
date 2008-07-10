/*******************************************************************************
 *  LegStar legacy Web-enablement .
 *  Copyright (C) 2007 LegSem
 *  
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *  
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *   
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 *  02110-1301  USA
 *  
 *******************************************************************************/
package com.legstar.coxb.convert.simple;

import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolArrayBinaryBinding;
import com.legstar.coxb.ICobolBinaryBinding;
import com.legstar.coxb.convert.ICobolBinaryConverter;
import com.legstar.coxb.convert.CobolConversionException;
import com.legstar.coxb.host.HostData;
import com.legstar.coxb.host.HostException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a concrete implementation of marshal/unmarshal operations of java
 * numerics to cobol zoned decimals.
 *
 * @author Fady Moussallam
 * 
 */
public class CobolBinarySimpleConverter extends CobolSimpleConverter 
             implements ICobolBinaryConverter {
	
	/**
	 * @param cobolContext the Cobol compiler parameters in effect
	 */
	public CobolBinarySimpleConverter(final CobolContext cobolContext) {
		super(cobolContext);
	}
	
	/** {@inheritDoc} */
	public final int toHost(
			final ICobolBinaryBinding ce,
			final byte[] hostTarget,
			final int offset)
	    throws HostException {
		int newOffset = 0;
		try {
			newOffset = toHostSingle(ce.getBigDecimalValue(),
					ce.getByteLength(),
					ce.isSigned(),
					hostTarget,
					offset);
		} catch (CobolConversionException e) {
			throwHostException(ce, e);
		}
		return newOffset;
	}
	
	/** {@inheritDoc} */
	public final int toHost(
			final ICobolArrayBinaryBinding ce,
			final byte[] hostTarget,
			final int offset,
			final int currentOccurs) 
        throws HostException {
		int newOffset = offset;
		try {
			for (BigDecimal javaSource : ce.getBigDecimalList()) {
					newOffset = toHostSingle(javaSource,
							ce.getByteLength(),
							ce.isSigned(),
							hostTarget,
							newOffset);
			}
			/* If necessary, fill in the array with missing items */
			for (int i = ce.getBigDecimalList().size();
							i < currentOccurs; i++) {
				newOffset = toHostSingle(new BigDecimal(0),
						ce.getByteLength(),
						ce.isSigned(),
						hostTarget,
						newOffset);
			}
		} catch (CobolConversionException e) {
			throwHostException(ce, e);
		}
		return newOffset;
	}
	
	/** {@inheritDoc} */
	public final int fromHost(
			final ICobolBinaryBinding ce,
			final byte[] hostSource,
			final int offset)
		throws HostException {
		int newOffset = offset;
		try {
			BigDecimal javaDecimal = fromHostSingle(ce.getByteLength(),
					ce.isSigned(),
					ce.getTotalDigits(),
					ce.getFractionDigits(),
					hostSource,
					newOffset);
			ce.setBigDecimalValue(javaDecimal);
			newOffset += ce.getByteLength();
		} catch (CobolConversionException e) {
			throwHostException(ce, e);
		}
		return newOffset;
	}
	
	/** {@inheritDoc} */
	public final int fromHost(
			final ICobolArrayBinaryBinding ce,
			final byte[] hostSource,
			final int offset,
			final int currentOccurs)
		throws HostException {
		List < BigDecimal > lArray = new ArrayList < BigDecimal >();
		int newOffset = offset;
		try {
			for (int i = 0; i < currentOccurs; i++) {
				BigDecimal javaDecimal = fromHostSingle(ce.getByteLength(),
						ce.isSigned(),
						ce.getTotalDigits(),
						ce.getFractionDigits(),
						hostSource,
						newOffset);
				lArray.add(javaDecimal);
				newOffset += ce.getByteLength();
			}
			ce.setBigDecimalList(lArray);
		
		} catch (CobolConversionException e) {
			throwHostException(ce, e);
		}
		return newOffset;
	}
	
	/**
	 *  Converts a Java BigDecimal to a host binary.
	 * 
	 * @param javaDecimal java decimal to convert
	 * @param cobolByteLength host byte length
	 * @param isSigned Cobol element is signed or unsigned
	 * @param hostTarget target host buffer
	 * @param offset offset in target host buffer
	 * @return offset after host buffer is updated
	 * @throws CobolConversionException if conversion fails
	 */
	public static final int toHostSingle(
			final BigDecimal javaDecimal,
			final int cobolByteLength,
			final boolean isSigned,
			final byte[] hostTarget,
			final int offset) throws CobolConversionException {
		
		/* Check that we are still within the host target range */
		int lastOffset = offset + cobolByteLength;
		if (lastOffset > hostTarget.length) {
			throw (
					new CobolConversionException(
							"Attempt to write past end of host source buffer",
							new HostData(hostTarget), offset, cobolByteLength));
		}

		/* Since binary items are not sensible to scale, we start by unscaling
		 * the BigDecimal */
		BigInteger javaInteger;
		if (javaDecimal == null) {
			javaInteger = new BigInteger("0");
		} else {
			javaInteger = javaDecimal.unscaledValue();
		}
		
		/**
		 * BigIntegers values are accessed as a byte array here. Usually the
		 * number of byte items in this array will be identical or smaller
		 * than the target cobol element. There is an exception though when
		 * the target cobol element is unsigned: because there is no sign bit,
		 * a smaller number of cobol byte items can actually hold a larger
		 * value than the same number of items in the corresponding java
		 * BigInteger byte array.
		 * For instance, values between "2^31 + 1" and "2^32" are stored on 5
		 * bytes in java with the most significant byte holding value 0.
		 */
		byte[] javaBytes = javaInteger.toByteArray();
		if (!isSigned) {
			if (javaBytes.length > cobolByteLength + 1) {
				throw (new CobolConversionException(
						"Java binary too large for Cobol element",
						new HostData(hostTarget), offset, cobolByteLength));
			} else {
				if ((javaBytes.length == cobolByteLength + 1)
					&& (javaBytes[0] != 0)) {
					throw (new CobolConversionException(
							"Java binary too large for Cobol element",
							new HostData(hostTarget), offset, cobolByteLength));
				}
			}
		} else {
			if (javaBytes.length > cobolByteLength) {
				throw (new CobolConversionException(
						"Java binary too large for Cobol element",
						new HostData(hostTarget), offset, cobolByteLength));
			}
		}
		
		/**
		 * Byte ordering is big-endian for both java and Cobol for z/os so no
		 * reordering is necessary.
		 * Java binaries are always signed when Cobol ones might be unsigned.
		 * This leads to situations where Java needs one additional byte to
		 * store the same value. That additional byte has a 0 value which can
		 * be safely ignored.
		 */
		int j = offset + cobolByteLength;
		for (int i = javaBytes.length; i > 0; i--) {
			if (j > offset) {
				hostTarget[j - 1] = javaBytes[i - 1];
				j--;
			}
		}
		/* If cobol field most significant bytes were not filled, we need to
		   set their value according to the binary value sign */
		while (j > offset) {
			if (javaInteger.signum() == -1) {
				hostTarget[j - 1] = -0x01;
			} else {
				hostTarget[j - 1] = 0;
			}
			j--;
		}
		return offset + cobolByteLength;
	}
	
	/** Converts a host binary to a Java BigDecimal.
	 * 
	 * @param cobolByteLength host byte length
	 * @param isSigned Cobol element is signed or unsigned
	 * @param totalDigits Cobol element total number of digits
	 * @param fractionDigits Cobol element number of fractional digits
	 * @param hostSource source host buffer
	 * @param offset offset in source host buffer
	 * @return offset after host buffer is read
	 * @throws CobolConversionException if conversion fails
	 */
	public static final BigDecimal fromHostSingle(
			final int cobolByteLength,
			final boolean isSigned,
			final int totalDigits,
			final int fractionDigits,
			final byte[] hostSource,
			final int offset) throws CobolConversionException {
		
		int lastOffset = offset + cobolByteLength;
		
		/* Check that we are still within the host source range */
		if (lastOffset > hostSource.length) {
			throw (new CobolConversionException(
					"Attempt to read past end of host source buffer",
					new HostData(hostSource), offset, cobolByteLength));
		}

		/* Construct a byte array with same byte ordering. The only difference
		 * is that java might need an extra byte with zero value to represent
		 * a positive integer */
		byte[] javaBytes;
		int j;
		if (isSigned) {
			javaBytes = new byte[cobolByteLength];
			j = cobolByteLength;
		} else {
			javaBytes = new byte[cobolByteLength + 1];
			j = cobolByteLength + 1;
		}
		
		for (int i = (offset + cobolByteLength); i > offset; i--) {
			if (j > 0) {
				javaBytes[j - 1] = hostSource[i - 1];
				j--;
			} else {
				/* Java binaries are always signed when Cobol ones might be
				 * unsigned. This leads to situations where Java needs one
				 * additional byte to store the same value. That additional
				 * byte has a 0 value.*/
				javaBytes[0] = 0;
			}
		}
		
		BigInteger result = new BigInteger(javaBytes);
		
		/* Scale the result according to number of fractional digits
		 * required */
		BigDecimal bDecimal = new BigDecimal(result, fractionDigits);
		
		return bDecimal;
	}

}