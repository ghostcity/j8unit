package org.j8unit.repository.java.lang;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.TypeNotPresentException class java.lang.TypeNotPresentException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.TypeNotPresentExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TypeNotPresentExceptionTests<SUT extends java.lang.TypeNotPresentException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.lang.TypeNotPresentException#typeName() public java.lang.String java.lang.TypeNotPresentException.typeName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_typeName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
