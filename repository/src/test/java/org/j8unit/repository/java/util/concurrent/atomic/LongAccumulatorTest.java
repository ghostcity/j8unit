package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.LongAccumulator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LongAccumulator} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.atomic.LongAccumulatorTests}).
 */
@RunWith(J8Unit4.class)
public class LongAccumulatorTest
implements LongAccumulatorTests<LongAccumulator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.LongAccumulator]

    @Override
    public LongAccumulator createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.atomic.LongAccumulator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.atomic.LongAccumulator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.atomic.LongAccumulator]

}
