package org.j8unit.repository.java.security.cert;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.cert.PKIXRevocationChecker class java.security.cert.PKIXRevocationChecker},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.security.cert.PKIXRevocationCheckerTests}.
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
 * @see org.j8unit.repository.java.security.cert.PKIXRevocationCheckerTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PKIXRevocationCheckerClassTests<SUT extends Class<? extends java.security.cert.PKIXRevocationChecker>>
extends org.j8unit.repository.java.security.cert.PKIXCertPathCheckerClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.security.cert.PKIXRevocationChecker$Option class
     * java.security.cert.PKIXRevocationChecker$Option}, containing all class relevant test methods (at least the test
     * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.security.cert.PKIXRevocationCheckerTests.OptionTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.security.cert.PKIXRevocationCheckerTests.OptionTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OptionClassTests<SUT extends Class<? extends java.security.cert.PKIXRevocationChecker.Option>>
    extends org.j8unit.repository.java.lang.EnumClassTests<SUT, java.security.cert.PKIXRevocationChecker.Option> {

        /**
         * <p>
         * Test method for {@link java.security.cert.PKIXRevocationChecker.Option#valueOf(java.lang.String) public
         * static java.security.cert.PKIXRevocationChecker$Option
         * java.security.cert.PKIXRevocationChecker$Option.valueOf(java.lang.String)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_valueOf_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.security.cert.PKIXRevocationChecker.Option#values() public static
         * java.security.cert.PKIXRevocationChecker$Option[] java.security.cert.PKIXRevocationChecker$Option.values()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_values()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.security.cert.PKIXRevocationChecker.Option> sut = createNewSUT();
            // assert assignability
            assertTrue(java.security.cert.PKIXRevocationChecker.Option.class.isAssignableFrom(sut));
        }

    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.security.cert.PKIXRevocationChecker> sut = createNewSUT();
        // assert assignability
        assertTrue(java.security.cert.PKIXRevocationChecker.class.isAssignableFrom(sut));
    }

}