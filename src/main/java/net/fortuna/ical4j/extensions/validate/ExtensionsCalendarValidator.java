package net.fortuna.ical4j.extensions.validate;

import net.fortuna.ical4j.extensions.property.*;
import net.fortuna.ical4j.extensions.property.Name;
import net.fortuna.ical4j.model.property.*;
import net.fortuna.ical4j.validate.CalendarValidatorImpl;

import java.util.Collections;

/**
 * Created by fortuna on 13/09/15.
 */
public class ExtensionsCalendarValidator extends CalendarValidatorImpl {

    public ExtensionsCalendarValidator() {
        Collections.addAll(calendarProperties, WrTimezone.class, WrRelCalId.class, CalStart.class, WrCalDesc.class, WrCalName.class,
            // calext
            Name.class, Description.class, Uid.class, LastModified.class, Url.class, Categories.class, RefreshInterval.class,
            Source.class, Color.class, Image.class, Conference.class);
    }
}
