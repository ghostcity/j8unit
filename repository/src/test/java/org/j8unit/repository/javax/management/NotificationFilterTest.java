package org.j8unit.repository.javax.management;

import javax.management.NotificationFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationFilterTest
implements org.j8unit.repository.javax.management.NotificationFilterTests<NotificationFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.NotificationFilter]

    @Override
    public NotificationFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.NotificationFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.NotificationFilter]

}