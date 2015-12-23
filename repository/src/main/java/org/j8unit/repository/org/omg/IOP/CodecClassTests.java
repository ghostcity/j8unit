package org.j8unit.repository.org.omg.IOP;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.IOP.Codec interface org.omg.IOP.Codec}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.IOP.CodecTests}.
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
 * @see org.j8unit.repository.org.omg.IOP.CodecTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.IOP.Codec
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CodecClassTests<SUT extends org.omg.IOP.Codec>
extends org.j8unit.repository.org.omg.IOP.CodecOperationsClassTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectClassTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityClassTests<SUT> {

    /**
     * @since 0.9.2
     *
     * @j8unit.aim org.omg.IOP.Codec#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.IOP.Codec.class.isAssignableFrom(sut));
    }

}
