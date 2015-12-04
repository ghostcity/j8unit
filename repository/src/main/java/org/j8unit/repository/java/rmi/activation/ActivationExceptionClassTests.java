package org.j8unit.repository.java.rmi.activation;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.activation.ActivationException class java.rmi.activation.ActivationException},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.rmi.activation.ActivationExceptionTests}.
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
 * @see org.j8unit.repository.java.rmi.activation.ActivationExceptionTests
 */
@Category(J8UnitRepository.class)
public abstract interface ActivationExceptionClassTests<SUT extends Class<? extends java.rmi.activation.ActivationException>>
extends org.j8unit.repository.java.lang.ExceptionClassTests<SUT> {

    /**
     * Test method for
     * {@link java.rmi.activation.ActivationException#ActivationException(java.lang.String,java.lang.Throwable) public
     * java.rmi.activation.ActivationException(java.lang.String,java.lang.Throwable)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivationException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.rmi.activation.ActivationException sut = null; // = new
                                                                  // ActivationException(java.lang.String,java.lang.Throwable);
    }

    /**
     * Test method for {@link java.rmi.activation.ActivationException#ActivationException(java.lang.String) public
     * java.rmi.activation.ActivationException(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.rmi.activation.ActivationException sut = null; // = new ActivationException(java.lang.String);
    }

    /**
     * Test method for {@link java.rmi.activation.ActivationException#ActivationException() public
     * java.rmi.activation.ActivationException()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ActivationException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.rmi.activation.ActivationException sut = null; // = new ActivationException();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.rmi.activation.ActivationException> sut = createNewSUT();
        // assert assignability
        assertTrue(java.rmi.activation.ActivationException.class.isAssignableFrom(sut));
    }

}
