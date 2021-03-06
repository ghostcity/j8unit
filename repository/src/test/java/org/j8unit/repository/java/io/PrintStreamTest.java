package org.j8unit.repository.java.io;

import java.io.PrintStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrintStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.PrintStreamTests}).
 */
@RunWith(J8Unit4.class)
public class PrintStreamTest
implements PrintStreamTests<PrintStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.PrintStream]

    @Override
    public PrintStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.io.PrintStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.PrintStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.PrintStream]

}
