package org.j8unit.repository.java.util;

import java.util.AbstractQueue;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractQueueTest<E>
implements org.j8unit.repository.java.util.AbstractQueueTests<AbstractQueue<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractQueue]

    @Override
    public AbstractQueue<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.AbstractQueue], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractQueue]

}