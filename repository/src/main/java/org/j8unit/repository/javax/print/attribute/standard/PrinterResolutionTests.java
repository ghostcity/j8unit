package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.attribute.standard.PrinterResolution class
 * javax.print.attribute.standard.PrinterResolution}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.print.attribute.standard.PrinterResolutionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.print.attribute.standard.PrinterResolutionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.attribute.standard.PrinterResolution
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrinterResolutionTests<SUT extends javax.print.attribute.standard.PrinterResolution>
extends org.j8unit.repository.javax.print.attribute.DocAttributeTests<SUT>, org.j8unit.repository.javax.print.attribute.PrintRequestAttributeTests<SUT>,
org.j8unit.repository.javax.print.attribute.PrintJobAttributeTests<SUT>, org.j8unit.repository.javax.print.attribute.ResolutionSyntaxTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.PrinterResolution#equals(java.lang.Object) public boolean
     * javax.print.attribute.standard.PrinterResolution.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.PrinterResolution#equals(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.PrinterResolution#getCategory() public final
     * java.lang.Class javax.print.attribute.standard.PrinterResolution.getCategory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.PrinterResolution#getCategory()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCategory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.PrinterResolution#getName() public final java.lang.String
     * javax.print.attribute.standard.PrinterResolution.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.attribute.standard.PrinterResolution#getName()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
