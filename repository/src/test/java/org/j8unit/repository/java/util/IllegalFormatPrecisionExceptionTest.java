package org.j8unit.repository.java.util;

import java.util.IllegalFormatPrecisionException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IllegalFormatPrecisionException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.IllegalFormatPrecisionExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class IllegalFormatPrecisionExceptionTest
implements IllegalFormatPrecisionExceptionTests<IllegalFormatPrecisionException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.IllegalFormatPrecisionException]

    @Override
    public IllegalFormatPrecisionException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.IllegalFormatPrecisionException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.IllegalFormatPrecisionException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.IllegalFormatPrecisionException]

}
