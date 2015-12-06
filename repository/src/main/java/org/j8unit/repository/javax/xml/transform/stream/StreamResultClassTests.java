package org.j8unit.repository.javax.xml.transform.stream;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.transform.stream.StreamResult class javax.xml.transform.stream.StreamResult},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.xml.transform.stream.StreamResultTests}.
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
 * @see org.j8unit.repository.javax.xml.transform.stream.StreamResultTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StreamResultClassTests<SUT extends Class<? extends javax.xml.transform.stream.StreamResult>>
extends org.j8unit.repository.javax.xml.transform.ResultClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.xml.transform.stream.StreamResult#StreamResult() public
     * javax.xml.transform.stream.StreamResult()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamResult()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamResult sut = null; // = new StreamResult();
    }

    /**
     * Test method for {@link javax.xml.transform.stream.StreamResult#StreamResult(java.io.File) public
     * javax.xml.transform.stream.StreamResult(java.io.File)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamResult_File()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamResult sut = null; // = new StreamResult(java.io.File);
    }

    /**
     * Test method for {@link javax.xml.transform.stream.StreamResult#StreamResult(java.io.OutputStream) public
     * javax.xml.transform.stream.StreamResult(java.io.OutputStream)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamResult_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamResult sut = null; // = new StreamResult(java.io.OutputStream);
    }

    /**
     * Test method for {@link javax.xml.transform.stream.StreamResult#StreamResult(java.lang.String) public
     * javax.xml.transform.stream.StreamResult(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamResult_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamResult sut = null; // = new StreamResult(java.lang.String);
    }

    /**
     * Test method for {@link javax.xml.transform.stream.StreamResult#StreamResult(java.io.Writer) public
     * javax.xml.transform.stream.StreamResult(java.io.Writer)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_StreamResult_Writer()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.xml.transform.stream.StreamResult sut = null; // = new StreamResult(java.io.Writer);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.xml.transform.stream.StreamResult> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.xml.transform.stream.StreamResult.class.isAssignableFrom(sut));
    }

}