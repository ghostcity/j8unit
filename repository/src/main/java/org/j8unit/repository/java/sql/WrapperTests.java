package org.j8unit.repository.java.sql;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.sql.Wrapper interface java.sql.Wrapper}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.sql.WrapperClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WrapperTests<SUT extends java.sql.Wrapper>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.Wrapper#isWrapperFor(java.lang.Class) public abstract boolean
     * java.sql.Wrapper.isWrapperFor(java.lang.Class) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isWrapperFor_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.Wrapper#unwrap(java.lang.Class) public abstract java.lang.Object
     * java.sql.Wrapper.unwrap(java.lang.Class) throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unwrap_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}