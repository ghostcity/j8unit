package org.j8unit.repository.javax.xml.bind;

import static org.junit.Assert.assertTrue;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.bind.Unmarshaller interface javax.xml.bind.Unmarshaller}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.bind.UnmarshallerTests}.
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
 * @see org.j8unit.repository.javax.xml.bind.UnmarshallerTests
 */
@Category(J8UnitRepository.class)
public abstract interface UnmarshallerClassTests<SUT extends Class<? extends javax.xml.bind.Unmarshaller>>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test class for {@link javax.xml.bind.Unmarshaller$Listener class javax.xml.bind.Unmarshaller$Listener},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.javax.xml.bind.UnmarshallerTests.ListenerTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.xml.bind.UnmarshallerTests.ListenerTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ListenerClassTests<SUT extends Class<? extends javax.xml.bind.Unmarshaller.Listener>>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * Test method for {@link javax.xml.bind.Unmarshaller.Listener#Listener() public
         * javax.xml.bind.Unmarshaller$Listener()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Listener()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final javax.xml.bind.Unmarshaller.Listener sut = null; // = new Listener();
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.xml.bind.Unmarshaller.Listener> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.xml.bind.Unmarshaller.Listener.class.isAssignableFrom(sut));
        }

    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.xml.bind.Unmarshaller> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.bind.Unmarshaller.class.isAssignableFrom(sut));
    }

}
