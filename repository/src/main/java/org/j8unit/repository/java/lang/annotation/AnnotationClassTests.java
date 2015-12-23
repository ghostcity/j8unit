package org.j8unit.repository.java.lang.annotation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Method;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.annotation.Annotation interface
 * java.lang.annotation.Annotation}, containing all class relevant test methods (at least the test methods of accessible
 * constructors and of accessible {@code static} methods). The counterpart J8Unit test interface containing the instance
 * relevant test methods is {@link org.j8unit.repository.java.lang.annotation.AnnotationTests}.
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
 * @see org.j8unit.repository.java.lang.annotation.AnnotationTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.annotation.Annotation
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AnnotationClassTests<SUT extends java.lang.annotation.Annotation>
extends RepositoryClassTests<SUT> {

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.annotation.Annotation
     */
    @Test
    public default void declaredMethodsCannotHaveFormalParameters() {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
        final Method[] methods = sut.getDeclaredMethods();
        assert methods != null;
        for (final Method method : methods) {
            try {
                final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());
                assert origin != null;
                continue;
            } catch (final NoSuchMethodException ignore) {
                final Class<?>[] formals = method.getParameterTypes();
                assert formals != null;
                assertEquals(0, formals.length);
            }
        }
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.annotation.Annotation
     */
    @Test
    public default void declaredMethodsCannotHaveThrowsClause() {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
        final Method[] methods = sut.getDeclaredMethods();
        assert methods != null;
        for (final Method method : methods) {
            try {
                final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());
                assert origin != null;
                continue;
            } catch (final NoSuchMethodException ignore) {
                final Class<?>[] exceptions = method.getExceptionTypes();
                assert exceptions != null;
                assertEquals(0, exceptions.length);
            }
        }
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.annotation.Annotation
     */
    @Test
    public default void declaredMethodsCannotHaveTypeParameters() {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
        final Method[] methods = sut.getDeclaredMethods();
        assert methods != null;
        for (final Method method : methods) {
            try {
                final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());
                assert origin != null;
                continue;
            } catch (final NoSuchMethodException ignore) {
                final java.lang.reflect.TypeVariable<Method>[] types = method.getTypeParameters();
                assert types != null;
                assertEquals(0, types.length);
            }
        }
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.annotation.Annotation#isAssignableFrom(java.lang.Class)
     */
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.annotation.Annotation.class.isAssignableFrom(sut));
    }
}
