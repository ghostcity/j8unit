package org.j8unit.repository.java.util;

import java.util.Optional;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Optional} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.OptionalTests}).
 */
@RunWith(J8Unit4.class)
public class OptionalTest<T>
implements OptionalTests<Optional<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Optional]

    @Override
    public Optional<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Optional], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Optional]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Optional]

}
