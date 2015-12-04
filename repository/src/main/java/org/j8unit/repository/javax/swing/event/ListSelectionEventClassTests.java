package org.j8unit.repository.javax.swing.event;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.event.ListSelectionEvent class javax.swing.event.ListSelectionEvent},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.swing.event.ListSelectionEventTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.ListSelectionEventTests
 */
@Category(J8UnitRepository.class)
public abstract interface ListSelectionEventClassTests<SUT extends Class<? extends javax.swing.event.ListSelectionEvent>>
extends org.j8unit.repository.java.util.EventObjectClassTests<SUT>
{

    /**
     * Test method for {@link javax.swing.event.ListSelectionEvent#ListSelectionEvent(java.lang.Object,int,int,boolean) public javax.swing.event.ListSelectionEvent(java.lang.Object,int,int,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ListSelectionEvent_Object_int_int_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.swing.event.ListSelectionEvent sut = null; // = new ListSelectionEvent(java.lang.Object,int,int,boolean);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.swing.event.ListSelectionEvent> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.event.ListSelectionEvent.class.isAssignableFrom(sut));
    }

}
