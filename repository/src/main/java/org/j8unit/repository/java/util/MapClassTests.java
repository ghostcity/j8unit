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
 * Test class for {@link java.util.Map interface java.util.Map},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.util.MapTests}.
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
 * @see org.j8unit.repository.java.util.MapTests
 */
@Category(J8UnitRepository.class)
public abstract interface MapClassTests<SUT extends Class<? extends java.util.Map<K,V>>, K, V>
extends J8UnitTest<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.util.Map<K,V>> sut = createNewSUT();
        // assert assignability
        assertTrue(java.util.Map.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test class for {@link java.util.Map$Entry interface java.util.Map$Entry},
     * containing all class relevant test methods (at least the test methods of accessible constructors and
     * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.util.MapTests.EntryTests}.
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
     * @see org.j8unit.repository.java.util.MapTests.EntryTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface EntryClassTests<SUT extends Class<? extends java.util.Map.Entry<K,V>>, K, V>
    extends J8UnitTest<SUT>
    {

        @Test
        public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
            // create new instance
            Class<? extends java.util.Map.Entry<K,V>> sut = createNewSUT();
            // assert assignability
            assertTrue(java.util.Map.Entry.class.isAssignableFrom(sut));
        }

        /**
         * <p>
         * Test method for {@link java.util.Map.Entry#comparingByKey(java.util.Comparator) public static java.util.Comparator java.util.Map$Entry.comparingByKey(java.util.Comparator)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_comparingByKey_Comparator() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Map.Entry#comparingByKey() public static java.util.Comparator java.util.Map$Entry.comparingByKey()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_comparingByKey() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Map.Entry#comparingByValue() public static java.util.Comparator java.util.Map$Entry.comparingByValue()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_comparingByValue() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Map.Entry#comparingByValue(java.util.Comparator) public static java.util.Comparator java.util.Map$Entry.comparingByValue(java.util.Comparator)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_comparingByValue_Comparator() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
