package org.j8unit.repository.java.util;

import java.util.Enumeration;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Enumeration} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.EnumerationTests}).
 */
@RunWith(J8Unit4.class)
public class EnumerationTest<E>
implements EnumerationTests<Enumeration<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Enumeration]

    @Override
    public Enumeration<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Enumeration], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Enumeration]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Enumeration]

}
