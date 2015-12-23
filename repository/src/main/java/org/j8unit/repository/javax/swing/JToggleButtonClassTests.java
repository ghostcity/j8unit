package org.j8unit.repository.javax.swing;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.JToggleButton class javax.swing.JToggleButton}, containing
 * all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.JToggleButtonTests}.
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
 * @see org.j8unit.repository.javax.swing.JToggleButtonTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.JToggleButton
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JToggleButtonClassTests<SUT extends javax.swing.JToggleButton>
extends org.j8unit.repository.javax.accessibility.AccessibleClassTests<SUT>, org.j8unit.repository.javax.swing.AbstractButtonClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.JToggleButton.ToggleButtonModel class
     * javax.swing.JToggleButton$ToggleButtonModel}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.JToggleButtonTests.ToggleButtonModelTests}.
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
     * @see org.j8unit.repository.javax.swing.JToggleButtonTests.ToggleButtonModelTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.JToggleButton.ToggleButtonModel
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToggleButtonModelClassTests<SUT extends javax.swing.JToggleButton.ToggleButtonModel>
    extends org.j8unit.repository.javax.swing.DefaultButtonModelClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.JToggleButton.ToggleButtonModel#ToggleButtonModel() public
         * javax.swing.JToggleButton$ToggleButtonModel()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.JToggleButton.ToggleButtonModel#ToggleButtonModel()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_ToggleButtonModel()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.swing.JToggleButton.ToggleButtonModel sut = null; // = new ToggleButtonModel();
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.JToggleButton.ToggleButtonModel#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.JToggleButton.ToggleButtonModel.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.JToggleButton#JToggleButton() public javax.swing.JToggleButton()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JToggleButton#JToggleButton()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToggleButton()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JToggleButton sut = null; // = new JToggleButton();
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JToggleButton#JToggleButton(javax.swing.Action) public
     * javax.swing.JToggleButton(javax.swing.Action)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JToggleButton#JToggleButton(javax.swing.Action)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToggleButton_Action()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JToggleButton sut = null; // = new JToggleButton(javax.swing.Action);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JToggleButton#JToggleButton(javax.swing.Icon) public
     * javax.swing.JToggleButton(javax.swing.Icon)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JToggleButton#JToggleButton(javax.swing.Icon)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToggleButton_Icon()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JToggleButton sut = null; // = new JToggleButton(javax.swing.Icon);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JToggleButton#JToggleButton(javax.swing.Icon, boolean) public
     * javax.swing.JToggleButton(javax.swing.Icon,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JToggleButton#JToggleButton(javax.swing.Icon, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToggleButton_Icon_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JToggleButton sut = null; // = new JToggleButton(javax.swing.Icon, boolean);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JToggleButton#JToggleButton(java.lang.String) public
     * javax.swing.JToggleButton(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JToggleButton#JToggleButton(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToggleButton_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JToggleButton sut = null; // = new JToggleButton(java.lang.String);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JToggleButton#JToggleButton(java.lang.String, boolean) public
     * javax.swing.JToggleButton(java.lang.String,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JToggleButton#JToggleButton(java.lang.String, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToggleButton_String_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JToggleButton sut = null; // = new JToggleButton(java.lang.String, boolean);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JToggleButton#JToggleButton(java.lang.String, javax.swing.Icon) public
     * javax.swing.JToggleButton(java.lang.String,javax.swing.Icon)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JToggleButton#JToggleButton(java.lang.String, javax.swing.Icon)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToggleButton_String_Icon()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JToggleButton sut = null; // = new JToggleButton(java.lang.String, javax.swing.Icon);
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JToggleButton#JToggleButton(java.lang.String, javax.swing.Icon, boolean)
     * public javax.swing.JToggleButton(java.lang.String,javax.swing.Icon,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.JToggleButton#JToggleButton(java.lang.String, javax.swing.Icon, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_JToggleButton_String_Icon_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.JToggleButton sut = null; // = new JToggleButton(java.lang.String, javax.swing.Icon, boolean);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.JToggleButton#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.JToggleButton.class.isAssignableFrom(sut));
    }

}
