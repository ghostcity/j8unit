package org.j8unit.repository.javax.naming.event;

import javax.naming.event.EventDirContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventDirContextTest
implements org.j8unit.repository.javax.naming.event.EventDirContextTests<EventDirContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.event.EventDirContext]

    @Override
    public EventDirContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.event.EventDirContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.event.EventDirContext]

}