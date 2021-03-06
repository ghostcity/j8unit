package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.TerminalFactorySpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TerminalFactorySpi} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.smartcardio.TerminalFactorySpiTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class TerminalFactorySpiTest
implements TerminalFactorySpiTests<TerminalFactorySpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.TerminalFactorySpi]

    @Override
    public TerminalFactorySpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.smartcardio.TerminalFactorySpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.smartcardio.TerminalFactorySpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.smartcardio.TerminalFactorySpi]

}
