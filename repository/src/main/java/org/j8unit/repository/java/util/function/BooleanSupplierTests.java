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
 * Test class for {@link java.util.function.BooleanSupplier interface java.util.function.BooleanSupplier},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.BooleanSupplierClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BooleanSupplierTests<SUT extends java.util.function.BooleanSupplier>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.function.BooleanSupplier#getAsBoolean() public abstract boolean java.util.function.BooleanSupplier.getAsBoolean()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAsBoolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
