package org.j8unit.repository.java.lang.management;

import java.lang.management.MemoryNotificationInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MemoryNotificationInfo} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.lang.management.MemoryNotificationInfoTests}).
 */
@RunWith(J8Unit4.class)
public class MemoryNotificationInfoTest
implements MemoryNotificationInfoTests<MemoryNotificationInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.MemoryNotificationInfo]

    @Override
    public MemoryNotificationInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.management.MemoryNotificationInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.management.MemoryNotificationInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.management.MemoryNotificationInfo]

}
