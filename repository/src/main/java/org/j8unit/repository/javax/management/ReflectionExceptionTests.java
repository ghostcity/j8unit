package org.j8unit.repository.javax.management;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.ReflectionException class javax.management.ReflectionException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.ReflectionExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ReflectionExceptionTests<SUT extends javax.management.ReflectionException>
extends org.j8unit.repository.javax.management.JMExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.management.ReflectionException#getCause() public java.lang.Throwable javax.management.ReflectionException.getCause()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCause() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.ReflectionException#getTargetException() public java.lang.Exception javax.management.ReflectionException.getTargetException()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetException() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
