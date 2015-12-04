package org.j8unit.repository.java.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.DuplicateFormatFlagsException class java.util.DuplicateFormatFlagsException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.DuplicateFormatFlagsExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DuplicateFormatFlagsExceptionTests<SUT extends java.util.DuplicateFormatFlagsException>
extends org.j8unit.repository.java.util.IllegalFormatExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.DuplicateFormatFlagsException#getMessage() public java.lang.String java.util.DuplicateFormatFlagsException.getMessage()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMessage() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.DuplicateFormatFlagsException#getFlags() public java.lang.String java.util.DuplicateFormatFlagsException.getFlags()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFlags() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
