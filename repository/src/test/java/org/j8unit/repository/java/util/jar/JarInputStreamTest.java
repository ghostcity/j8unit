package org.j8unit.repository.java.util.jar;

import java.util.jar.JarInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JarInputStream} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.jar.JarInputStreamTests}).
 */
@RunWith(J8Unit4.class)
public class JarInputStreamTest
implements JarInputStreamTests<JarInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.JarInputStream]

    @Override
    public JarInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.jar.JarInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.jar.JarInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.jar.JarInputStream]

}
