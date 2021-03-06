package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.DirStateFactory;
import javax.naming.spi.DirStateFactory.Result;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link DirStateFactory
 * public abstract interface javax.naming.spi.DirStateFactory}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.naming.spi.DirStateFactoryClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DirStateFactoryTests<SUT extends DirStateFactory>
extends StateFactoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.DirStateFactory]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.naming.spi.DirStateFactory#getStateToBind(Object, javax.naming.Name, javax.naming.Context, java.util.Hashtable, javax.naming.directory.Attributes)
     * public abstract javax.naming.spi.DirStateFactory$Result
     * javax.naming.spi.DirStateFactory.getStateToBind(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable<?,
     * ?>,javax.naming.directory.Attributes) throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStateToBind_Object_Name_Context_Hashtable_Attributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.DirStateFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.DirStateFactory]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Result
     * public static class javax.naming.spi.DirStateFactory$Result}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.naming.spi.DirStateFactoryClassTests.ResultClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ResultTests<SUT extends Result>
    extends ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.DirStateFactory$Result]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.naming.spi.DirStateFactory.Result#getObject() public java.lang.Object
         * javax.naming.spi.DirStateFactory$Result.getObject()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getObject()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.naming.spi.DirStateFactory.Result#getAttributes() public javax.naming.directory.Attributes
         * javax.naming.spi.DirStateFactory$Result.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getAttributes()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.DirStateFactory$Result]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.DirStateFactory$Result]

    }

}
