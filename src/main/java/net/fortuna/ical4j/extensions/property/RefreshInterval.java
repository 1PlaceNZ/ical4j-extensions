package net.fortuna.ical4j.extensions.property;

import net.fortuna.ical4j.model.*;
import net.fortuna.ical4j.validate.ValidationException;

/**
 * Created by fortuna on 11/09/15.
 */
public class RefreshInterval extends Property {

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME = "REFRESH-INTERVAL";

    private String value;

    public RefreshInterval() {
        super(PROPERTY_NAME, PropertyFactoryImpl.getInstance());
    }

    public RefreshInterval(ParameterList params, String value) {
        super(PROPERTY_NAME, params, PropertyFactoryImpl.getInstance());
        setValue(value);
    }

    @Override
    public void setValue(String aValue) {
        this.value = aValue;
    }

    @Override
    public void validate() throws ValidationException {

    }

    @Override
    public String getValue() {
        return value;
    }

    public static class Factory extends Content.Factory implements PropertyFactory<RefreshInterval> {
        public Factory() {
            super(PROPERTY_NAME);
        }

        public RefreshInterval createProperty() {
            return new RefreshInterval();
        }

        public RefreshInterval createProperty(ParameterList parameters, String value) {
            RefreshInterval property = new RefreshInterval(parameters, value);
            return property;
        }
    }
}
