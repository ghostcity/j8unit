package org.j8unit.repository.javax.xml.datatype;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.datatype.DatatypeConstants class
 * javax.xml.datatype.DatatypeConstants}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.datatype.DatatypeConstantsTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.datatype.DatatypeConstants
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DatatypeConstantsTests<SUT extends javax.xml.datatype.DatatypeConstants>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.xml.datatype.DatatypeConstants.Field class
     * javax.xml.datatype.DatatypeConstants$Field}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.xml.datatype.DatatypeConstantsTests.FieldTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.xml.datatype.DatatypeConstantsClassTests.FieldClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.xml.datatype.DatatypeConstants.Field
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FieldTests<SUT extends javax.xml.datatype.DatatypeConstants.Field>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.datatype.DatatypeConstants.Field#getId() public int
         * javax.xml.datatype.DatatypeConstants$Field.getId()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.xml.datatype.DatatypeConstants.Field#getId()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getId()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.xml.datatype.DatatypeConstants.Field#toString() public java.lang.String
         * javax.xml.datatype.DatatypeConstants$Field.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.xml.datatype.DatatypeConstants.Field#toString()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
