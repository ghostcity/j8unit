package org.j8unit.repository.java.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.Spliterator interface java.util.Spliterator},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.SpliteratorTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.SpliteratorTests
 */
@Category(J8UnitRepository.class)
public abstract interface SpliteratorClassTests<SUT extends Class<? extends java.util.Spliterator<T>>, T>
extends J8UnitTest<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.Spliterator<T>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.Spliterator.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link java.util.Spliterator$OfLong interface java.util.Spliterator$OfLong},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.SpliteratorTests.OfLongTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorTests.OfLongTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfLongClassTests<SUT extends Class<? extends java.util.Spliterator.OfLong>>
    extends org.j8unit.repository.java.util.SpliteratorClassTests.OfPrimitiveClassTests<SUT,java.lang.Long,java.util.function.LongConsumer,java.util.Spliterator.OfLong>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.Spliterator.OfLong> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Spliterator.OfLong.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.Spliterator$OfPrimitive interface java.util.Spliterator$OfPrimitive},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.SpliteratorTests.OfPrimitiveTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorTests.OfPrimitiveTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfPrimitiveClassTests<SUT extends Class<? extends java.util.Spliterator.OfPrimitive<T,T_CONS,T_SPLITR>>, T, T_CONS, T_SPLITR extends java.util.Spliterator.OfPrimitive<T,T_CONS,T_SPLITR>>
    extends org.j8unit.repository.java.util.SpliteratorClassTests<SUT,T>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.Spliterator.OfPrimitive<T,T_CONS,T_SPLITR>> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Spliterator.OfPrimitive.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.Spliterator$OfDouble interface java.util.Spliterator$OfDouble},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.SpliteratorTests.OfDoubleTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorTests.OfDoubleTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfDoubleClassTests<SUT extends Class<? extends java.util.Spliterator.OfDouble>>
    extends org.j8unit.repository.java.util.SpliteratorClassTests.OfPrimitiveClassTests<SUT,java.lang.Double,java.util.function.DoubleConsumer,java.util.Spliterator.OfDouble>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.Spliterator.OfDouble> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Spliterator.OfDouble.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.util.Spliterator$OfInt interface java.util.Spliterator$OfInt},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.SpliteratorTests.OfIntTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself.
     * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
     * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
     * provides a corresponding, inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
     * runtime constraints and further class specific requirements.
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.util.SpliteratorTests.OfIntTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface OfIntClassTests<SUT extends Class<? extends java.util.Spliterator.OfInt>>
    extends org.j8unit.repository.java.util.SpliteratorClassTests.OfPrimitiveClassTests<SUT,java.lang.Integer,java.util.function.IntConsumer,java.util.Spliterator.OfInt>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.Spliterator.OfInt> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Spliterator.OfInt.class.isAssignableFrom(sut));
        }

    }

}
