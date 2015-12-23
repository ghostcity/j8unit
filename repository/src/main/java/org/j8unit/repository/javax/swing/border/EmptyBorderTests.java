package org.j8unit.repository.javax.swing.border;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.border.EmptyBorder class javax.swing.border.EmptyBorder},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.border.EmptyBorderTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.border.EmptyBorderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.border.EmptyBorder
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EmptyBorderTests<SUT extends javax.swing.border.EmptyBorder>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.border.EmptyBorder#getBorderInsets() public java.awt.Insets
     * javax.swing.border.EmptyBorder.getBorderInsets()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.border.EmptyBorder#getBorderInsets()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBorderInsets()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.border.EmptyBorder#getBorderInsets(java.awt.Component, java.awt.Insets) public
     * java.awt.Insets javax.swing.border.EmptyBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.border.EmptyBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getBorderInsets_Component_Insets()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.border.EmptyBorder#isBorderOpaque() public boolean
     * javax.swing.border.EmptyBorder.isBorderOpaque()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.border.EmptyBorder#isBorderOpaque()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isBorderOpaque()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.border.EmptyBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
     * public void javax.swing.border.EmptyBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.border.EmptyBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paintBorder_Component_Graphics_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
