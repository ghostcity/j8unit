package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.DynSequence;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DynSequence} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.DynSequenceTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class DynSequenceTest
implements org.j8unit.repository.org.omg.CORBA.DynSequenceTests<DynSequence> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.DynSequence]

    @Override
    public DynSequence createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.DynSequence], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.DynSequence]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.DynSequence]

}
