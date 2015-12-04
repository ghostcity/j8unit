package org.j8unit.repository.java.util.function;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.function.LongFunction interface java.util.function.LongFunction},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.LongFunctionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LongFunctionTests<SUT extends java.util.function.LongFunction<R>, R>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.function.LongFunction#apply(long) public abstract java.lang.Object java.util.function.LongFunction.apply(long)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_apply_long() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
