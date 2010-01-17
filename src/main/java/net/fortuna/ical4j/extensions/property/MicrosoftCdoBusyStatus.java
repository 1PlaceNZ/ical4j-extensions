/**
 * Copyright (c) 2009, Ben Fortuna
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  o Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 *  o Neither the name of Ben Fortuna nor the names of any other contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.fortuna.ical4j.extensions.property;

import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyFactory;
import net.fortuna.ical4j.model.ValidationException;

/**
 * @author fortuna
 *
 */
public class MicrosoftCdoBusyStatus extends Property {

    private static final long serialVersionUID = -3514682572599864426L;

    private static final String NAME = "X-MICROSOFT-CDO-BUSYSTATUS";
    
    public static final PropertyFactory FACTORY = new Factory();
    
    public static final MicrosoftCdoBusyStatus BUSY = new MicrosoftCdoBusyStatus(new ParameterList(true), FACTORY, "BUSY");
    
    private String value;
    
    /**
     * @param factory
     */
    public MicrosoftCdoBusyStatus(PropertyFactory factory) {
        super(NAME, factory);
    }

    /**
     * @param aList
     * @param factory
     */
    public MicrosoftCdoBusyStatus(ParameterList aList, PropertyFactory factory, String value) {
        super(NAME, aList, factory);
        setValue(value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setValue(String aValue) {
        this.value = aValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void validate() throws ValidationException {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getValue() {
        return value;
    }

    private static class Factory implements PropertyFactory {
        
        private static final long serialVersionUID = 596282786680252116L;

        public Property createProperty(String name) {
            return new MicrosoftCdoBusyStatus(this);
        }
        
        public Property createProperty(String name, ParameterList parameters, String value) {
            MicrosoftCdoBusyStatus property = null;
            if (BUSY.getValue().equals(value)) {
                property = BUSY;
            }
            else {
                property = new MicrosoftCdoBusyStatus(parameters, this, value);
            }
            return property;
        }
    }
}
