package org.j8unit.repository.org.xml.sax;

import static org.junit.Assert.assertTrue;
import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.xml.sax.AttributeList interface org.xml.sax.AttributeList}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.xml.sax.AttributeListTests}.
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
 * @see org.j8unit.repository.org.xml.sax.AttributeListTests
 */
@Category(J8UnitRepository.class)
public abstract interface AttributeListClassTests<SUT extends Class<? extends org.xml.sax.AttributeList>>
extends J8UnitTest<SUT> {

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.xml.sax.AttributeList> sut = createNewSUT();
        // assert assignability
        assertTrue(org.xml.sax.AttributeList.class.isAssignableFrom(sut));
    }

}
