package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.VisibilityHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link VisibilityHelper} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.VisibilityHelperTests}).
 */
@RunWith(J8Unit4.class)
public class VisibilityHelperTest
implements VisibilityHelperTests<VisibilityHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.VisibilityHelper]

    @Override
    public VisibilityHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.VisibilityHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.VisibilityHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.VisibilityHelper]

}
