package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_MULTIPLE_COMPONENTS;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TAG_MULTIPLE_COMPONENTS} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.TAG_MULTIPLE_COMPONENTSTests}).
 */
@RunWith(J8Unit4.class)
public class TAG_MULTIPLE_COMPONENTSTest
implements TAG_MULTIPLE_COMPONENTSTests<TAG_MULTIPLE_COMPONENTS> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TAG_MULTIPLE_COMPONENTS]

    @Override
    public TAG_MULTIPLE_COMPONENTS createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.TAG_MULTIPLE_COMPONENTS], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TAG_MULTIPLE_COMPONENTS]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TAG_MULTIPLE_COMPONENTS]

}
