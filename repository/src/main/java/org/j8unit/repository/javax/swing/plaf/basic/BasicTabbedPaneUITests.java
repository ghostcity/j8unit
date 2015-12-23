package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTabbedPaneUI class
 * javax.swing.plaf.basic.BasicTabbedPaneUI}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicTabbedPaneUITests<SUT extends javax.swing.plaf.basic.BasicTabbedPaneUI>
extends org.j8unit.repository.javax.swing.SwingConstantsTests<SUT>, org.j8unit.repository.javax.swing.plaf.TabbedPaneUITests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler class
     * javax.swing.plaf.basic.BasicTabbedPaneUI$FocusHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.FocusHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUIClassTests.FocusHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FocusHandlerTests<SUT extends javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler>
    extends org.j8unit.repository.java.awt.event.FocusAdapterTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler#focusGained(java.awt.event.FocusEvent) public
         * void javax.swing.plaf.basic.BasicTabbedPaneUI$FocusHandler.focusGained(java.awt.event.FocusEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler#focusGained(java.awt.event.FocusEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_focusGained_FocusEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler#focusLost(java.awt.event.FocusEvent) public void
         * javax.swing.plaf.basic.BasicTabbedPaneUI$FocusHandler.focusLost(java.awt.event.FocusEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.FocusHandler#focusLost(java.awt.event.FocusEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_focusLost_FocusEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler class
     * javax.swing.plaf.basic.BasicTabbedPaneUI$MouseHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.MouseHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUIClassTests.MouseHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MouseHandlerTests<SUT extends javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler>
    extends org.j8unit.repository.java.awt.event.MouseAdapterTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler#mousePressed(java.awt.event.MouseEvent) public
         * void javax.swing.plaf.basic.BasicTabbedPaneUI$MouseHandler.mousePressed(java.awt.event.MouseEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler#mousePressed(java.awt.event.MouseEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mousePressed_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler
     * class javax.swing.plaf.basic.BasicTabbedPaneUI$PropertyChangeHandler}, containing all instance relevant test
     * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
     * containing the class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.PropertyChangeHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUIClassTests.PropertyChangeHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerTests<SUT extends javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicTabbedPaneUI$PropertyChangeHandler.propertyChange(java.beans.PropertyChangeEvent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.PropertyChangeHandler#propertyChange(java.beans.
         *             PropertyChangeEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_propertyChange_PropertyChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout class
     * javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.TabbedPaneLayoutTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUIClassTests.TabbedPaneLayoutClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TabbedPaneLayoutTests<SUT extends javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout>
    extends org.j8unit.repository.java.awt.LayoutManagerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#addLayoutComponent(java.lang.String, java.awt.Component)
         * public void
         * javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout.addLayoutComponent(java.lang.String,java.awt.Component)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#addLayoutComponent(java.lang.String,
         *             java.awt.Component)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addLayoutComponent_String_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#calculateLayoutInfo() public
         * void javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout.calculateLayoutInfo()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#calculateLayoutInfo()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_calculateLayoutInfo()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#layoutContainer(java.awt.Container) public
         * void javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout.layoutContainer(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#layoutContainer(java.awt.Container)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_layoutContainer_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#minimumLayoutSize(java.awt.Container) public
         * java.awt.Dimension
         * javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout.minimumLayoutSize(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#minimumLayoutSize(java.awt.Container)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_minimumLayoutSize_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#preferredLayoutSize(java.awt.Container)
         * public java.awt.Dimension
         * javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout.preferredLayoutSize(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#preferredLayoutSize(java.awt.Container)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_preferredLayoutSize_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#removeLayoutComponent(java.awt.Component)
         * public void
         * javax.swing.plaf.basic.BasicTabbedPaneUI$TabbedPaneLayout.removeLayoutComponent(java.awt.Component)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout#removeLayoutComponent(java.awt.
         *             Component)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_removeLayoutComponent_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler class
     * javax.swing.plaf.basic.BasicTabbedPaneUI$TabSelectionHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.TabSelectionHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUIClassTests.TabSelectionHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TabSelectionHandlerTests<SUT extends javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler#stateChanged(javax.swing.event.ChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicTabbedPaneUI$TabSelectionHandler.stateChanged(javax.swing.event.ChangeEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler#stateChanged(javax.swing.event.
         *             ChangeEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_stateChanged_ChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#getBaseline(javax.swing.JComponent, int, int)
     * public int javax.swing.plaf.basic.BasicTabbedPaneUI.getBaseline(javax.swing.JComponent,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI#getBaseline(javax.swing.JComponent, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getBaseline_JComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#getBaselineResizeBehavior(javax.swing.JComponent)
     * public java.awt.Component$BaselineResizeBehavior
     * javax.swing.plaf.basic.BasicTabbedPaneUI.getBaselineResizeBehavior(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI#getBaselineResizeBehavior(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getBaselineResizeBehavior_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#getMaximumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicTabbedPaneUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI#getMaximumSize(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMaximumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#getMinimumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicTabbedPaneUI.getMinimumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI#getMinimumSize(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMinimumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#getTabBounds(javax.swing.JTabbedPane, int) public
     * java.awt.Rectangle javax.swing.plaf.basic.BasicTabbedPaneUI.getTabBounds(javax.swing.JTabbedPane,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI#getTabBounds(javax.swing.JTabbedPane, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getTabBounds_JTabbedPane_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#getTabRunCount(javax.swing.JTabbedPane) public
     * int javax.swing.plaf.basic.BasicTabbedPaneUI.getTabRunCount(javax.swing.JTabbedPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI#getTabRunCount(javax.swing.JTabbedPane)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getTabRunCount_JTabbedPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicTabbedPaneUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI#installUI(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_installUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#paint(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.basic.BasicTabbedPaneUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI#paint(java.awt.Graphics, javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paint_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTabbedPaneUI#tabForCoordinate(javax.swing.JTabbedPane, int, int) public int
     * javax.swing.plaf.basic.BasicTabbedPaneUI.tabForCoordinate(javax.swing.JTabbedPane,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI#tabForCoordinate(javax.swing.JTabbedPane, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_tabForCoordinate_JTabbedPane_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTabbedPaneUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicTabbedPaneUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicTabbedPaneUI#uninstallUI(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_uninstallUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
