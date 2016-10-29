package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.RunnableFuture;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RunnableFutureTest<V>
implements org.j8unit.repository.java.util.concurrent.RunnableFutureTests<RunnableFuture<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.RunnableFuture]

    @Override
    public RunnableFuture<V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.RunnableFuture], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.RunnableFuture]

}