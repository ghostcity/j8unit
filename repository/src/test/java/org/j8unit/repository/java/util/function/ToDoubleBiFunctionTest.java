package org.j8unit.repository.java.util.function;

import java.util.function.ToDoubleBiFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToDoubleBiFunctionTest<T, U>
implements org.j8unit.repository.java.util.function.ToDoubleBiFunctionTests<ToDoubleBiFunction<T, U>, T, U> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ToDoubleBiFunction]

    @Override
    public ToDoubleBiFunction<T, U> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.function.ToDoubleBiFunction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.ToDoubleBiFunction]

}