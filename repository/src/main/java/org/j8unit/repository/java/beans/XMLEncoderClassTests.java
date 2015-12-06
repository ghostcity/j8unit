package org.j8unit.repository.java.beans;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.XMLEncoder class java.beans.XMLEncoder}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.beans.XMLEncoderTests}.
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
 * @see org.j8unit.repository.java.beans.XMLEncoderTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLEncoderClassTests<SUT extends Class<? extends java.beans.XMLEncoder>>
extends org.j8unit.repository.java.lang.AutoCloseableClassTests<SUT>, org.j8unit.repository.java.beans.EncoderClassTests<SUT> {

    /**
     * Test method for {@link java.beans.XMLEncoder#XMLEncoder(java.io.OutputStream) public
     * java.beans.XMLEncoder(java.io.OutputStream)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLEncoder_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.XMLEncoder sut = null; // = new XMLEncoder(java.io.OutputStream);
    }

    /**
     * Test method for {@link java.beans.XMLEncoder#XMLEncoder(java.io.OutputStream,java.lang.String,boolean,int) public
     * java.beans.XMLEncoder(java.io.OutputStream,java.lang.String,boolean,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_XMLEncoder_OutputStream_String_boolean_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.XMLEncoder sut = null; // = new XMLEncoder(java.io.OutputStream,java.lang.String,boolean,int);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.beans.XMLEncoder> sut = createNewSUT();
        // assert assignability
        assertTrue(java.beans.XMLEncoder.class.isAssignableFrom(sut));
    }

}