package org.j8unit.repository.java.lang.ref;

import java.lang.ref.PhantomReference;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PhantomReference} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.ref.PhantomReferenceTests}).
 */
@RunWith(J8Unit4.class)
public class PhantomReferenceTest<T>
implements PhantomReferenceTests<PhantomReference<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.ref.PhantomReference]

    @Override
    public PhantomReference<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.ref.PhantomReference], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.ref.PhantomReference]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.ref.PhantomReference]

}
