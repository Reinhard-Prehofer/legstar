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

package com.legstar.coxb.cust.redopera;
import java.util.Hashtable;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolChoiceBinding;
import com.legstar.coxb.ICobolUnmarshalChoiceStrategy;
import com.legstar.coxb.CobolElementVisitor;
import com.legstar.coxb.host.HostException;
import com.legstar.test.coxb.redopera.DfhcommareaType;

/** 
 * Skeleton implementation of a custom choice selection strategy. Modify this
 * code to select a suitable alternative.
 */
public class ChoiceSelector implements ICobolUnmarshalChoiceStrategy {

	/** {@inheritDoc} */
  public final ICobolBinding choose(
      final ICobolChoiceBinding choice,
      final Hashtable < String, Object > variablesMap,
      final CobolElementVisitor visitor)
    throws HostException {
    
		/* Get the current value of the function variable. */
		DfhcommareaType jobj = (DfhcommareaType) choice.getParentValueObject();
		
		if (jobj.getCFunction().trim().compareTo("stringMethod") == 0) {
			return choice.getAlternativeByName("Filler25");
		}

		if (jobj.getCFunction().trim().compareTo("intMethod") == 0) {
			return choice.getAlternativeByName("Filler28");
		}

		/* None of the alternatives could be chosen. Raise an error.*/
		throw (new HostException("Unrecognized CFunction value:" 
				+ jobj.getCFunction()));
  }

}
  
