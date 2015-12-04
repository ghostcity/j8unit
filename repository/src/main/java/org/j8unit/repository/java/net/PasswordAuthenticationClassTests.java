package org.j8unit.repository.java.net;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.net.PasswordAuthentication class java.net.PasswordAuthentication}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.net.PasswordAuthenticationTests}.
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
 * @see org.j8unit.repository.java.net.PasswordAuthenticationTests
 */
@Category(J8UnitRepository.class)
public abstract interface PasswordAuthenticationClassTests<SUT extends Class<? extends java.net.PasswordAuthentication>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.net.PasswordAuthentication#PasswordAuthentication(java.lang.String,char[]) public
     * java.net.PasswordAuthentication(java.lang.String,char[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PasswordAuthentication_String_charArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.PasswordAuthentication sut = null; // = new PasswordAuthentication(java.lang.String,char[]);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.net.PasswordAuthentication> sut = createNewSUT();
        // assert assignability
        assertTrue(java.net.PasswordAuthentication.class.isAssignableFrom(sut));
    }

}
