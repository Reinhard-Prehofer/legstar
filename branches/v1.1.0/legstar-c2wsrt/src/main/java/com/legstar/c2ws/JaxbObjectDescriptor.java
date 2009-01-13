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
package com.legstar.c2ws;

/**
 * This class holds the parameters that describe a JAXB object that
 * may describe a web service message payload.
 */
public class JaxbObjectDescriptor {
	
	/** The JAXB package name. */
	private String mPackageName;
	
	/** The JAXB class name. */
	private String mTypeName;
	
	/** The JAXB element name (XmlRootElement). */
	private String mElementName;

	
	/** No-Argument constructor. */
	public JaxbObjectDescriptor() {
		
	}
	
	/**
	 * @return the JAXB package name
	 */
	public final String getPackageName() {
		return mPackageName;
	}

	/**
	 * @param packageName the JAXB package name to set
	 */
	public final void setPackageName(final String packageName) {
		mPackageName = packageName;
	}

	/**
	 * @return the JAXB class name
	 */
	public final String getTypeName() {
		return mTypeName;
	}

	/**
	 * @param typeName the JAXB class name to set
	 */
	public final void setTypeName(final String typeName) {
		mTypeName = typeName;
	}

	/**
	 * @return the JAXB element name
	 */
	public final String getElementName() {
		/* For those types which are XmlRootElements, there is no need
		 * for an element name. So it might be omitted from the configuration.*/
		if (mElementName == null || mElementName.length() == 0) {
			mElementName = mTypeName;
		}
		return mElementName;
	}
	
	/**
	 * Types can be XmlRootElements in which case they can be directly used in
	 * SOAP messages. If not, they need to be encapsulated in a JAXBElement.
	 * @return true if the type is an Xml root element
	 */
	public final boolean isXmlRootElement() {
		return (getElementName().compareTo(getTypeName()) == 0);
	}

	/**
	 * @param elementName the JAXB element name to set
	 */
	public final void setElementName(final String elementName) {
		mElementName = elementName;
	}

	/** {@inheritDoc} */
	public final String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("JAXB package=");
		sb.append(mPackageName);
		sb.append(", ");
		sb.append("JAXB class=");
		sb.append(mTypeName);
		sb.append(", ");
		sb.append("JAXB element=");
		sb.append(mElementName);
		return sb.toString();
	}

}