package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicVerticalLayoutManager;
import javax.swing.plaf.basic.BasicSplitPaneUI.FocusHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardEndHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardResizeToggleHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.PropertyHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.awt.LayoutManager2Tests;
import org.j8unit.repository.java.awt.event.ActionListenerTests;
import org.j8unit.repository.java.awt.event.FocusAdapterTests;
import org.j8unit.repository.java.beans.PropertyChangeListenerTests;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.javax.swing.plaf.SplitPaneUITests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link BasicSplitPaneUI public class javax.swing.plaf.basic.BasicSplitPaneUI}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicSplitPaneUITests<SUT extends BasicSplitPaneUI>
extends SplitPaneUITests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#paint(java.awt.Graphics, javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicSplitPaneUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paint_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getSplitPane() public javax.swing.JSplitPane
     * javax.swing.plaf.basic.BasicSplitPaneUI.getSplitPane()}.
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
    public default void test_getSplitPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getInsets(javax.swing.JComponent) public java.awt.Insets
     * javax.swing.plaf.basic.BasicSplitPaneUI.getInsets(javax.swing.JComponent)}.
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
    public default void test_getInsets_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#setOrientation(int) public void
     * javax.swing.plaf.basic.BasicSplitPaneUI.setOrientation(int)}.
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
    public default void test_setOrientation_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#resetToPreferredSizes(javax.swing.JSplitPane) public void
     * javax.swing.plaf.basic.BasicSplitPaneUI.resetToPreferredSizes(javax.swing.JSplitPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_resetToPreferredSizes_JSplitPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getNonContinuousLayoutDivider() public java.awt.Component
     * javax.swing.plaf.basic.BasicSplitPaneUI.getNonContinuousLayoutDivider()}.
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
    public default void test_getNonContinuousLayoutDivider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getMinimumDividerLocation(javax.swing.JSplitPane) public int
     * javax.swing.plaf.basic.BasicSplitPaneUI.getMinimumDividerLocation(javax.swing.JSplitPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMinimumDividerLocation_JSplitPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getMaximumSize(javax.swing.JComponent) public java.awt.Dimension
     * javax.swing.plaf.basic.BasicSplitPaneUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMaximumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#createDefaultDivider() public
     * javax.swing.plaf.basic.BasicSplitPaneDivider javax.swing.plaf.basic.BasicSplitPaneUI.createDefaultDivider()}.
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
    public default void test_createDefaultDivider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getLastDragLocation() public int
     * javax.swing.plaf.basic.BasicSplitPaneUI.getLastDragLocation()}.
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
    public default void test_getLastDragLocation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getMaximumDividerLocation(javax.swing.JSplitPane) public int
     * javax.swing.plaf.basic.BasicSplitPaneUI.getMaximumDividerLocation(javax.swing.JSplitPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMaximumDividerLocation_JSplitPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicSplitPaneUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_uninstallUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.plaf.basic.BasicSplitPaneUI#getDivider()
     * public javax.swing.plaf.basic.BasicSplitPaneDivider javax.swing.plaf.basic.BasicSplitPaneUI.getDivider()}.
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
    public default void test_getDivider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#setContinuousLayout(boolean) public void
     * javax.swing.plaf.basic.BasicSplitPaneUI.setContinuousLayout(boolean)}.
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
    public default void test_setContinuousLayout_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getDividerLocation(javax.swing.JSplitPane) public int
     * javax.swing.plaf.basic.BasicSplitPaneUI.getDividerLocation(javax.swing.JSplitPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDividerLocation_JSplitPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#setLastDragLocation(int) public void
     * javax.swing.plaf.basic.BasicSplitPaneUI.setLastDragLocation(int)}.
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
    public default void test_setLastDragLocation_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getOrientation() public int
     * javax.swing.plaf.basic.BasicSplitPaneUI.getOrientation()}.
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
    public default void test_getOrientation()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicSplitPaneUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_installUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getPreferredSize(javax.swing.JComponent) public java.awt.Dimension
     * javax.swing.plaf.basic.BasicSplitPaneUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPreferredSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#setDividerLocation(javax.swing.JSplitPane, int) public void
     * javax.swing.plaf.basic.BasicSplitPaneUI.setDividerLocation(javax.swing.JSplitPane,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setDividerLocation_JSplitPane_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#getMinimumSize(javax.swing.JComponent) public java.awt.Dimension
     * javax.swing.plaf.basic.BasicSplitPaneUI.getMinimumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMinimumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#finishedPaintingChildren(javax.swing.JSplitPane, java.awt.Graphics)
     * public void
     * javax.swing.plaf.basic.BasicSplitPaneUI.finishedPaintingChildren(javax.swing.JSplitPane,java.awt.Graphics)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_finishedPaintingChildren_JSplitPane_Graphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.basic.BasicSplitPaneUI#isContinuousLayout() public boolean
     * javax.swing.plaf.basic.BasicSplitPaneUI.isContinuousLayout()}.
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
    public default void test_isContinuousLayout()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link BasicHorizontalLayoutManager public class
     * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.BasicHorizontalLayoutManagerClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BasicHorizontalLayoutManagerTests<SUT extends BasicHorizontalLayoutManager>
    extends LayoutManager2Tests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#preferredLayoutSize(java.awt.Container)
         * public java.awt.Dimension
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.preferredLayoutSize(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_preferredLayoutSize_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#resetToPreferredSizes() public
         * void javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.resetToPreferredSizes()}.
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
        public default void test_resetToPreferredSizes()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#invalidateLayout(java.awt.Container)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.invalidateLayout(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_invalidateLayout_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#removeLayoutComponent(java.awt.Component)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.removeLayoutComponent(java.awt.Component)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_removeLayoutComponent_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#getLayoutAlignmentX(java.awt.Container)
         * public float
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.getLayoutAlignmentX(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getLayoutAlignmentX_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#minimumLayoutSize(java.awt.Container)
         * public java.awt.Dimension
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.minimumLayoutSize(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_minimumLayoutSize_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#getLayoutAlignmentY(java.awt.Container)
         * public float
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.getLayoutAlignmentY(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getLayoutAlignmentY_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#maximumLayoutSize(java.awt.Container)
         * public java.awt.Dimension
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.maximumLayoutSize(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_maximumLayoutSize_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#layoutContainer(java.awt.Container)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.layoutContainer(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_layoutContainer_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#addLayoutComponent(java.awt.Component, Object)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.addLayoutComponent(java.awt.Component,java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_addLayoutComponent_Component_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager#addLayoutComponent(String, java.awt.Component)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager.addLayoutComponent(java.lang.String,java.awt.Component)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_addLayoutComponent_String_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicHorizontalLayoutManager]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link KeyboardResizeToggleHandler public class
     * javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.KeyboardResizeToggleHandlerClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KeyboardResizeToggleHandlerTests<SUT extends KeyboardResizeToggleHandler>
    extends ActionListenerTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardResizeToggleHandler#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardResizeToggleHandler]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link KeyboardHomeHandler public class javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.KeyboardHomeHandlerClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KeyboardHomeHandlerTests<SUT extends KeyboardHomeHandler>
    extends ActionListenerTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardHomeHandler]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link KeyboardUpLeftHandler public class javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.KeyboardUpLeftHandlerClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KeyboardUpLeftHandlerTests<SUT extends KeyboardUpLeftHandler>
    extends ActionListenerTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardUpLeftHandler]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link BasicVerticalLayoutManager public class
     * javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.BasicVerticalLayoutManagerClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BasicVerticalLayoutManagerTests<SUT extends BasicVerticalLayoutManager>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUITests.BasicHorizontalLayoutManagerTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$BasicVerticalLayoutManager]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link KeyboardEndHandler public class javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.KeyboardEndHandlerClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KeyboardEndHandlerTests<SUT extends KeyboardEndHandler>
    extends ActionListenerTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardEndHandler#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardEndHandler]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link KeyboardDownRightHandler public class javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.KeyboardDownRightHandlerClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KeyboardDownRightHandlerTests<SUT extends KeyboardDownRightHandler>
    extends ActionListenerTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$KeyboardDownRightHandler]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link FocusHandler public class javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.FocusHandlerClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FocusHandlerTests<SUT extends FocusHandler>
    extends FocusAdapterTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.FocusHandler#focusLost(java.awt.event.FocusEvent) public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler.focusLost(java.awt.event.FocusEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_focusLost_FocusEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.FocusHandler#focusGained(java.awt.event.FocusEvent) public
         * void javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler.focusGained(java.awt.event.FocusEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_focusGained_FocusEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$FocusHandler]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link PropertyHandler public class javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSplitPaneUIClassTests.PropertyHandlerClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyHandlerTests<SUT extends PropertyHandler>
    extends PropertyChangeListenerTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.basic.BasicSplitPaneUI.PropertyHandler#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler.propertyChange(java.beans.PropertyChangeEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_propertyChange_PropertyChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicSplitPaneUI$PropertyHandler]

    }

}
