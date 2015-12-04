package org.j8unit.repository.java.awt.event;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.MouseEvent class java.awt.event.MouseEvent}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.event.MouseEventTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.event.MouseEventTests
 */
@Category(J8UnitRepository.class)
public abstract interface MouseEventClassTests<SUT extends Class<? extends java.awt.event.MouseEvent>>
extends org.j8unit.repository.java.awt.event.InputEventClassTests<SUT> {

    /**
     * Test method for {@link java.awt.event.MouseEvent#MouseEvent(java.awt.Component,int,long,int,int,int,int,boolean)
     * public java.awt.event.MouseEvent(java.awt.Component,int,long,int,int,int,int,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MouseEvent_Component_int_long_int_int_int_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.MouseEvent sut = null; // = new
                                                    // MouseEvent(java.awt.Component,int,long,int,int,int,int,boolean);
    }

    /**
     * Test method for
     * {@link java.awt.event.MouseEvent#MouseEvent(java.awt.Component,int,long,int,int,int,int,boolean,int) public
     * java.awt.event.MouseEvent(java.awt.Component,int,long,int,int,int,int,boolean,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MouseEvent_Component_int_long_int_int_int_int_boolean_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.MouseEvent sut = null; // = new
                                                    // MouseEvent(java.awt.Component,int,long,int,int,int,int,boolean,int);
    }

    /**
     * Test method for
     * {@link java.awt.event.MouseEvent#MouseEvent(java.awt.Component,int,long,int,int,int,int,int,int,boolean,int)
     * public java.awt.event.MouseEvent(java.awt.Component,int,long,int,int,int,int,int,int,boolean,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_MouseEvent_Component_int_long_int_int_int_int_int_int_boolean_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.awt.event.MouseEvent sut = null; // = new
                                                    // MouseEvent(java.awt.Component,int,long,int,int,int,int,int,int,boolean,int);
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.MouseEvent#getMouseModifiersText(int) public static java.lang.String
     * java.awt.event.MouseEvent.getMouseModifiersText(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMouseModifiersText_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.awt.event.MouseEvent> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.event.MouseEvent.class.isAssignableFrom(sut));
    }

}
