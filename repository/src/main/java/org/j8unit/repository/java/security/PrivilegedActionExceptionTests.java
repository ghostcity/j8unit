package org.j8unit.repository.java.security;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.security.PrivilegedActionException class java.security.PrivilegedActionException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.PrivilegedActionExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PrivilegedActionExceptionTests<SUT extends java.security.PrivilegedActionException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.security.PrivilegedActionException#getException() public java.lang.Exception java.security.PrivilegedActionException.getException()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getException() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.PrivilegedActionException#toString() public java.lang.String java.security.PrivilegedActionException.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.PrivilegedActionException#getCause() public java.lang.Throwable java.security.PrivilegedActionException.getCause()}.
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

}
