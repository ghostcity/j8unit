package org.j8unit.repository.java.util.function;

import java.util.function.ToLongFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToLongFunctionTest<T>
implements org.j8unit.repository.java.util.function.ToLongFunctionTests<ToLongFunction<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ToLongFunction]

    @Override
    public ToLongFunction<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.ToLongFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ToLongFunction]

}