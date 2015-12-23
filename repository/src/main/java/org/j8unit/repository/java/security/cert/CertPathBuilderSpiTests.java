package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CertPathBuilderSpi class
 * java.security.cert.CertPathBuilderSpi}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.cert.CertPathBuilderSpiTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CertPathBuilderSpiClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CertPathBuilderSpi
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathBuilderSpiTests<SUT extends java.security.cert.CertPathBuilderSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilderSpi#engineBuild(java.security.cert.CertPathParameters)
     * public abstract java.security.cert.CertPathBuilderResult
     * java.security.cert.CertPathBuilderSpi.engineBuild(java.security.cert.CertPathParameters) throws
     * java.security.cert.CertPathBuilderException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.cert.CertPathBuilderSpi#engineBuild(java.security.cert.CertPathParameters)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineBuild_CertPathParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.cert.CertPathBuilderSpi#engineGetRevocationChecker() public
     * java.security.cert.CertPathChecker java.security.cert.CertPathBuilderSpi.engineGetRevocationChecker()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.security.cert.CertPathBuilderSpi#engineGetRevocationChecker()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_engineGetRevocationChecker()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
