package org.j8unit.repository.javax.swing.plaf.basic;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameUI class
 * javax.swing.plaf.basic.BasicInternalFrameUI}, containing all class relevant test methods (at least the test methods
 * of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameUITests}.
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
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameUITests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicInternalFrameUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicInternalFrameUIClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameUI>
extends org.j8unit.repository.javax.swing.plaf.InternalFrameUIClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout
     * class javax.swing.plaf.basic.BasicInternalFrameUI$InternalFrameLayout}, containing all class relevant test
     * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart J8Unit test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameUITests.InternalFrameLayoutTests}.
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameUITests.InternalFrameLayoutTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InternalFrameLayoutClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout>
    extends org.j8unit.repository.java.awt.LayoutManagerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout#InternalFrameLayout(javax.swing.plaf.basic.BasicInternalFrameUI)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameUI$InternalFrameLayout(javax.swing.plaf.basic.BasicInternalFrameUI)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout#InternalFrameLayout(javax.swing.
         *             plaf.basic.BasicInternalFrameUI)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_InternalFrameLayout_BasicInternalFrameUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout sut = null; // = new
                                                                                              // InternalFrameLayout(javax.swing.plaf.basic.BasicInternalFrameUI);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for
     * {@linkplain javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener class
     * javax.swing.plaf.basic.BasicInternalFrameUI$InternalFramePropertyChangeListener}, containing all class relevant
     * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart J8Unit test interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameUITests.InternalFramePropertyChangeListenerTests}
     * .
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
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameUITests.
     *      InternalFramePropertyChangeListenerTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InternalFramePropertyChangeListenerClassTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener#InternalFramePropertyChangeListener(javax.swing.plaf.basic.BasicInternalFrameUI)
         * public
         * javax.swing.plaf.basic.BasicInternalFrameUI$InternalFramePropertyChangeListener(javax.swing.plaf.basic.BasicInternalFrameUI)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener#
         *             InternalFramePropertyChangeListener(javax.swing.plaf.basic.BasicInternalFrameUI)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_InternalFramePropertyChangeListener_BasicInternalFrameUI()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener sut = null; // = new
                                                                                                              // InternalFramePropertyChangeListener(javax.swing.plaf.basic.BasicInternalFrameUI);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener#isAssignableFrom(
         *             java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicInternalFrameUI#BasicInternalFrameUI(javax.swing.JInternalFrame) public
     * javax.swing.plaf.basic.BasicInternalFrameUI(javax.swing.JInternalFrame)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicInternalFrameUI#BasicInternalFrameUI(javax.swing.JInternalFrame)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BasicInternalFrameUI_JInternalFrame()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.plaf.basic.BasicInternalFrameUI sut = null; // = new
                                                                      // BasicInternalFrameUI(javax.swing.JInternalFrame);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicInternalFrameUI#createUI(javax.swing.JComponent) public static
     * javax.swing.plaf.ComponentUI javax.swing.plaf.basic.BasicInternalFrameUI.createUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicInternalFrameUI#createUI(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicInternalFrameUI#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.plaf.basic.BasicInternalFrameUI.class.isAssignableFrom(sut));
    }

}
