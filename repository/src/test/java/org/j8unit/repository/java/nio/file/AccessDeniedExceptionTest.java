package org.j8unit.repository.java.nio.file;

import java.nio.file.AccessDeniedException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessDeniedException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.file.AccessDeniedExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class AccessDeniedExceptionTest
implements AccessDeniedExceptionTests<AccessDeniedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.AccessDeniedException]

    @Override
    public AccessDeniedException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.AccessDeniedException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.AccessDeniedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.AccessDeniedException]

}
