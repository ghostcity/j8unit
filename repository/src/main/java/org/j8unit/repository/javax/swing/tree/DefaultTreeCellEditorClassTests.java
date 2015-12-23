package org.j8unit.repository.javax.swing.tree;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.tree.DefaultTreeCellEditor class
 * javax.swing.tree.DefaultTreeCellEditor}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultTreeCellEditorClassTests<SUT extends javax.swing.tree.DefaultTreeCellEditor>
extends org.j8unit.repository.java.awt.event.ActionListenerClassTests<SUT>, org.j8unit.repository.javax.swing.tree.TreeCellEditorClassTests<SUT>,
org.j8unit.repository.javax.swing.event.TreeSelectionListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.tree.DefaultTreeCellEditor.DefaultTextField class
     * javax.swing.tree.DefaultTreeCellEditor$DefaultTextField}, containing all class relevant test methods (at least
     * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit
     * test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests.DefaultTextFieldTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests.DefaultTextFieldTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.DefaultTextField
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultTextFieldClassTests<SUT extends javax.swing.tree.DefaultTreeCellEditor.DefaultTextField>
    extends org.j8unit.repository.javax.swing.JTextFieldClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#DefaultTextField(javax.swing.tree.DefaultTreeCellEditor, javax.swing.border.Border)
         * public
         * javax.swing.tree.DefaultTreeCellEditor$DefaultTextField(javax.swing.tree.DefaultTreeCellEditor,javax.swing.border.Border)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#DefaultTextField(javax.swing.tree.
         *             DefaultTreeCellEditor, javax.swing.border.Border)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_DefaultTextField_DefaultTreeCellEditor_Border()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.tree.DefaultTreeCellEditor.DefaultTextField sut = null; // = new
                                                                                      // DefaultTextField(javax.swing.tree.DefaultTreeCellEditor,
                                                                                      // javax.swing.border.Border);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.DefaultTextField#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.tree.DefaultTreeCellEditor.DefaultTextField.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.tree.DefaultTreeCellEditor.EditorContainer class
     * javax.swing.tree.DefaultTreeCellEditor$EditorContainer}, containing all class relevant test methods (at least the
     * test methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests.EditorContainerTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.tree.DefaultTreeCellEditorTests.EditorContainerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.EditorContainer
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EditorContainerClassTests<SUT extends javax.swing.tree.DefaultTreeCellEditor.EditorContainer>
    extends org.j8unit.repository.java.awt.ContainerClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.tree.DefaultTreeCellEditor.EditorContainer#EditorContainer(javax.swing.tree.DefaultTreeCellEditor)
         * public javax.swing.tree.DefaultTreeCellEditor$EditorContainer(javax.swing.tree.DefaultTreeCellEditor)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.EditorContainer#EditorContainer(javax.swing.tree.
         *             DefaultTreeCellEditor)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_EditorContainer_DefaultTreeCellEditor()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.tree.DefaultTreeCellEditor.EditorContainer sut = null; // = new
                                                                                     // EditorContainer(javax.swing.tree.DefaultTreeCellEditor);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor.EditorContainer#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.tree.DefaultTreeCellEditor.EditorContainer.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#DefaultTreeCellEditor(javax.swing.JTree, javax.swing.tree.DefaultTreeCellRenderer)
     * public javax.swing.tree.DefaultTreeCellEditor(javax.swing.JTree,javax.swing.tree.DefaultTreeCellRenderer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#DefaultTreeCellEditor(javax.swing.JTree,
     *             javax.swing.tree.DefaultTreeCellRenderer)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultTreeCellEditor_JTree_DefaultTreeCellRenderer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.tree.DefaultTreeCellEditor sut = null; // = new DefaultTreeCellEditor(javax.swing.JTree,
                                                                 // javax.swing.tree.DefaultTreeCellRenderer);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.tree.DefaultTreeCellEditor#DefaultTreeCellEditor(javax.swing.JTree, javax.swing.tree.DefaultTreeCellRenderer, javax.swing.tree.TreeCellEditor)
     * public
     * javax.swing.tree.DefaultTreeCellEditor(javax.swing.JTree,javax.swing.tree.DefaultTreeCellRenderer,javax.swing.tree.TreeCellEditor)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#DefaultTreeCellEditor(javax.swing.JTree,
     *             javax.swing.tree.DefaultTreeCellRenderer, javax.swing.tree.TreeCellEditor)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultTreeCellEditor_JTree_DefaultTreeCellRenderer_TreeCellEditor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.tree.DefaultTreeCellEditor sut = null; // = new DefaultTreeCellEditor(javax.swing.JTree,
                                                                 // javax.swing.tree.DefaultTreeCellRenderer,
                                                                 // javax.swing.tree.TreeCellEditor);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.tree.DefaultTreeCellEditor#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.tree.DefaultTreeCellEditor.class.isAssignableFrom(sut));
    }

}
