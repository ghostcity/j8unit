package org.j8unit.repository.java.util;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.Properties class java.util.Properties}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.util.PropertiesTests}.
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
 * @see org.j8unit.repository.java.util.PropertiesTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PropertiesClassTests<SUT extends Class<? extends java.util.Properties>>
extends org.j8unit.repository.java.util.HashtableClassTests<SUT, java.lang.Object, java.lang.Object> {

    /**
     * Test method for {@link java.util.Properties#Properties() public java.util.Properties()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Properties()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Properties sut = null; // = new Properties();
    }

    /**
     * Test method for {@link java.util.Properties#Properties(java.util.Properties) public
     * java.util.Properties(java.util.Properties)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Properties_Properties()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.util.Properties sut = null; // = new Properties(java.util.Properties);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.util.Properties> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.Properties.class.isAssignableFrom(sut));
    }

}