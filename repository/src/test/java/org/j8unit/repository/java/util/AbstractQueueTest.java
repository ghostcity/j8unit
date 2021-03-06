package org.j8unit.repository.java.util;

import java.util.AbstractQueue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractQueue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.AbstractQueueTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractQueueTest<E>
implements AbstractQueueTests<AbstractQueue<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractQueue]

    @Override
    public AbstractQueue<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.AbstractQueue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.AbstractQueue]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.AbstractQueue]

}
