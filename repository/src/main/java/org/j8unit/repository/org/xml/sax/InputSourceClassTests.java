package org.j8unit.repository.org.xml.sax;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.xml.sax.InputSource class org.xml.sax.InputSource}, containing all class relevant test
 * methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.xml.sax.InputSourceTests}.
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
 * @see org.j8unit.repository.org.xml.sax.InputSourceTests
 */
@Category(J8UnitRepository.class)
public abstract interface InputSourceClassTests<SUT extends Class<? extends org.xml.sax.InputSource>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link org.xml.sax.InputSource#InputSource() public org.xml.sax.InputSource()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InputSource()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.xml.sax.InputSource sut = null; // = new InputSource();
    }

    /**
     * Test method for {@link org.xml.sax.InputSource#InputSource(java.io.InputStream) public
     * org.xml.sax.InputSource(java.io.InputStream)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InputSource_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.xml.sax.InputSource sut = null; // = new InputSource(java.io.InputStream);
    }

    /**
     * Test method for {@link org.xml.sax.InputSource#InputSource(java.io.Reader) public
     * org.xml.sax.InputSource(java.io.Reader)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InputSource_Reader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.xml.sax.InputSource sut = null; // = new InputSource(java.io.Reader);
    }

    /**
     * Test method for {@link org.xml.sax.InputSource#InputSource(java.lang.String) public
     * org.xml.sax.InputSource(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InputSource_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.xml.sax.InputSource sut = null; // = new InputSource(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.xml.sax.InputSource> sut = createNewSUT();
        // assert assignability
        assertTrue(org.xml.sax.InputSource.class.isAssignableFrom(sut));
    }

}
