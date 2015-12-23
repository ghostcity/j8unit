package org.j8unit.repository.javax.swing.event;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.event.HyperlinkEvent class
 * javax.swing.event.HyperlinkEvent}, containing all class relevant test methods (at least the test methods of
 * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing
 * the instance relevant test methods is {@link org.j8unit.repository.javax.swing.event.HyperlinkEventTests}.
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
 * @see org.j8unit.repository.javax.swing.event.HyperlinkEventTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.event.HyperlinkEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HyperlinkEventClassTests<SUT extends javax.swing.event.HyperlinkEvent>
extends org.j8unit.repository.java.util.EventObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.event.HyperlinkEvent.EventType class
     * javax.swing.event.HyperlinkEvent$EventType}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test
     * interface containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.swing.event.HyperlinkEventTests.EventTypeTests}.
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
     * @see org.j8unit.repository.javax.swing.event.HyperlinkEventTests.EventTypeTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.event.HyperlinkEvent.EventType
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EventTypeClassTests<SUT extends javax.swing.event.HyperlinkEvent.EventType>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim javax.swing.event.HyperlinkEvent.EventType#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.swing.event.HyperlinkEvent.EventType.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.event.HyperlinkEvent#HyperlinkEvent(java.lang.Object, javax.swing.event.HyperlinkEvent.EventType, java.net.URL)
     * public
     * javax.swing.event.HyperlinkEvent(java.lang.Object,javax.swing.event.HyperlinkEvent$EventType,java.net.URL)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.event.HyperlinkEvent#HyperlinkEvent(java.lang.Object,
     *             javax.swing.event.HyperlinkEvent.EventType, java.net.URL)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HyperlinkEvent_Object_EventType_URL()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.event.HyperlinkEvent sut = null; // = new HyperlinkEvent(java.lang.Object,
                                                           // javax.swing.event.HyperlinkEvent.EventType, java.net.URL);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.event.HyperlinkEvent#HyperlinkEvent(java.lang.Object, javax.swing.event.HyperlinkEvent.EventType, java.net.URL, java.lang.String)
     * public
     * javax.swing.event.HyperlinkEvent(java.lang.Object,javax.swing.event.HyperlinkEvent$EventType,java.net.URL,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.event.HyperlinkEvent#HyperlinkEvent(java.lang.Object,
     *             javax.swing.event.HyperlinkEvent.EventType, java.net.URL, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HyperlinkEvent_Object_EventType_URL_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.event.HyperlinkEvent sut = null; // = new HyperlinkEvent(java.lang.Object,
                                                           // javax.swing.event.HyperlinkEvent.EventType, java.net.URL,
                                                           // java.lang.String);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.event.HyperlinkEvent#HyperlinkEvent(java.lang.Object, javax.swing.event.HyperlinkEvent.EventType, java.net.URL, java.lang.String, javax.swing.text.Element)
     * public
     * javax.swing.event.HyperlinkEvent(java.lang.Object,javax.swing.event.HyperlinkEvent$EventType,java.net.URL,java.lang.String,javax.swing.text.Element)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.event.HyperlinkEvent#HyperlinkEvent(java.lang.Object,
     *             javax.swing.event.HyperlinkEvent.EventType, java.net.URL, java.lang.String, javax.swing.text.Element)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HyperlinkEvent_Object_EventType_URL_String_Element()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.event.HyperlinkEvent sut = null; // = new HyperlinkEvent(java.lang.Object,
                                                           // javax.swing.event.HyperlinkEvent.EventType, java.net.URL,
                                                           // java.lang.String, javax.swing.text.Element);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.event.HyperlinkEvent#HyperlinkEvent(java.lang.Object, javax.swing.event.HyperlinkEvent.EventType, java.net.URL, java.lang.String, javax.swing.text.Element, java.awt.event.InputEvent)
     * public
     * javax.swing.event.HyperlinkEvent(java.lang.Object,javax.swing.event.HyperlinkEvent$EventType,java.net.URL,java.lang.String,javax.swing.text.Element,java.awt.event.InputEvent)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.event.HyperlinkEvent#HyperlinkEvent(java.lang.Object,
     *             javax.swing.event.HyperlinkEvent.EventType, java.net.URL, java.lang.String, javax.swing.text.Element,
     *             java.awt.event.InputEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_HyperlinkEvent_Object_EventType_URL_String_Element_InputEvent()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.event.HyperlinkEvent sut = null; // = new HyperlinkEvent(java.lang.Object,
                                                           // javax.swing.event.HyperlinkEvent.EventType, java.net.URL,
                                                           // java.lang.String, javax.swing.text.Element,
                                                           // java.awt.event.InputEvent);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.swing.event.HyperlinkEvent#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.event.HyperlinkEvent.class.isAssignableFrom(sut));
    }

}
