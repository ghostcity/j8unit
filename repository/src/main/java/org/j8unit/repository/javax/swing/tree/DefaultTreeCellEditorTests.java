package org.j8unit.repository.javax.swing.tree;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.tree.DefaultTreeCellEditor class
 * javax.swing.tree.DefaultTreeCellEditor}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultTreeCellEditorTests<SUT extends javax.swing.tree.DefaultTreeCellEditor>
extends org.j8unit.repository.java.awt.event.ActionListenerTests<SUT>, org.j8unit.repository.javax.swing.tree.TreeCellEditorTests<SUT>,
org.j8unit.repository.javax.swing.event.TreeSelectionListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.tree.DefaultTreeCellEditor.DefaultTextField class
     * javax.swing.tree.DefaultTreeCellEditor$DefaultTextField}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests.DefaultTextFieldTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorClassTests.DefaultTextFieldClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.DefaultTextField
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultTextFieldTests<SUT extends javax.swing.tree.DefaultTreeCellEditor.DefaultTextField>
    extends org.j8unit.repository.javax.swing.JTextFieldTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getBorder() public
         * javax.swing.border.Border javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getBorder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getBorder()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorder()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getFont() public java.awt.Font
         * javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getFont()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getFont()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getFont()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getPreferredSize() public
         * java.awt.Dimension javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.getPreferredSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#getPreferredSize()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getPreferredSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#setBorder(javax.swing.border.Border) public
         * void javax.swing.tree.DefaultTreeCellEditor$DefaultTextField.setBorder(javax.swing.border.Border)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#setBorder(javax.swing.border.Border)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_setBorder_Border()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.tree.DefaultTreeCellEditor.EditorContainer class
     * javax.swing.tree.DefaultTreeCellEditor$EditorContainer}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests.EditorContainerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorClassTests.EditorContainerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.EditorContainer
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EditorContainerTests<SUT extends javax.swing.tree.DefaultTreeCellEditor.EditorContainer>
    extends org.j8unit.repository.java.awt.ContainerTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#doLayout() public void
         * javax.swing.tree.DefaultTreeCellEditor$EditorContainer.doLayout()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.EditorContainer#doLayout()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_doLayout()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#EditorContainer() public void
         * javax.swing.tree.DefaultTreeCellEditor$EditorContainer.EditorContainer()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.EditorContainer#EditorContainer()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_EditorContainer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#getPreferredSize() public
         * java.awt.Dimension javax.swing.tree.DefaultTreeCellEditor$EditorContainer.getPreferredSize()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.EditorContainer#getPreferredSize()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getPreferredSize()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#paint(java.awt.Graphics) public
         * void javax.swing.tree.DefaultTreeCellEditor$EditorContainer.paint(java.awt.Graphics)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.EditorContainer#paint(java.awt.Graphics)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paint_Graphics()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#actionPerformed(java.awt.event.ActionEvent) public
     * void javax.swing.tree.DefaultTreeCellEditor.actionPerformed(java.awt.event.ActionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#actionPerformed(java.awt.event.ActionEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_actionPerformed_ActionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#addCellEditorListener(javax.swing.event.CellEditorListener) public
     * void javax.swing.tree.DefaultTreeCellEditor.addCellEditorListener(javax.swing.event.CellEditorListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#addCellEditorListener(javax.swing.event.CellEditorListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addCellEditorListener_CellEditorListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#cancelCellEditing() public void
     * javax.swing.tree.DefaultTreeCellEditor.cancelCellEditing()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#cancelCellEditing()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_cancelCellEditing()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getBorderSelectionColor() public java.awt.Color
     * javax.swing.tree.DefaultTreeCellEditor.getBorderSelectionColor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#getBorderSelectionColor()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBorderSelectionColor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getCellEditorListeners() public
     * javax.swing.event.CellEditorListener[] javax.swing.tree.DefaultTreeCellEditor.getCellEditorListeners()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#getCellEditorListeners()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCellEditorListeners()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getCellEditorValue() public java.lang.Object
     * javax.swing.tree.DefaultTreeCellEditor.getCellEditorValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#getCellEditorValue()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCellEditorValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#getFont() public java.awt.Font
     * javax.swing.tree.DefaultTreeCellEditor.getFont()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#getFont()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFont()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#getTreeCellEditorComponent(javax.swing.JTree, java.lang.Object, boolean, boolean, boolean, int)
     * public java.awt.Component
     * javax.swing.tree.DefaultTreeCellEditor.getTreeCellEditorComponent(javax.swing.JTree,java.lang.Object,boolean,boolean,boolean,int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#getTreeCellEditorComponent(javax.swing.JTree,
     *             java.lang.Object, boolean, boolean, boolean, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getTreeCellEditorComponent_JTree_Object_boolean_boolean_boolean_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#isCellEditable(java.util.EventObject) public
     * boolean javax.swing.tree.DefaultTreeCellEditor.isCellEditable(java.util.EventObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#isCellEditable(java.util.EventObject)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isCellEditable_EventObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#removeCellEditorListener(javax.swing.event.CellEditorListener)
     * public void
     * javax.swing.tree.DefaultTreeCellEditor.removeCellEditorListener(javax.swing.event.CellEditorListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#removeCellEditorListener(javax.swing.event.CellEditorListener)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeCellEditorListener_CellEditorListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#setBorderSelectionColor(java.awt.Color) public void
     * javax.swing.tree.DefaultTreeCellEditor.setBorderSelectionColor(java.awt.Color)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#setBorderSelectionColor(java.awt.Color)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setBorderSelectionColor_Color()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#setFont(java.awt.Font) public void
     * javax.swing.tree.DefaultTreeCellEditor.setFont(java.awt.Font)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#setFont(java.awt.Font)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFont_Font()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#shouldSelectCell(java.util.EventObject) public
     * boolean javax.swing.tree.DefaultTreeCellEditor.shouldSelectCell(java.util.EventObject)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#shouldSelectCell(java.util.EventObject)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_shouldSelectCell_EventObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#stopCellEditing() public boolean
     * javax.swing.tree.DefaultTreeCellEditor.stopCellEditing()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#stopCellEditing()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_stopCellEditing()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.tree.DefaultTreeCellEditor#valueChanged(javax.swing.event.TreeSelectionEvent)
     * public void javax.swing.tree.DefaultTreeCellEditor.valueChanged(javax.swing.event.TreeSelectionEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#valueChanged(javax.swing.event.TreeSelectionEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_valueChanged_TreeSelectionEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
