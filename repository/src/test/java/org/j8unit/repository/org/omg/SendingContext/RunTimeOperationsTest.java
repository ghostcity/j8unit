package org.j8unit.repository.org.omg.SendingContext;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.SendingContext.RunTimeOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RunTimeOperations} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.SendingContext.RunTimeOperationsTests}).
 */
@RunWith(J8Unit4.class)
public class RunTimeOperationsTest
implements RunTimeOperationsTests<RunTimeOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.SendingContext.RunTimeOperations]

    @Override
    public RunTimeOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.SendingContext.RunTimeOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.SendingContext.RunTimeOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.SendingContext.RunTimeOperations]

}
