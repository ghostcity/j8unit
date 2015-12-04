package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.CanonicalizationMethod interface
 * javax.xml.crypto.dsig.CanonicalizationMethod}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.CanonicalizationMethodClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CanonicalizationMethodTests<SUT extends javax.xml.crypto.dsig.CanonicalizationMethod>
extends org.j8unit.repository.javax.xml.crypto.dsig.TransformTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.CanonicalizationMethod#getParameterSpec() public abstract
     * java.security.spec.AlgorithmParameterSpec javax.xml.crypto.dsig.CanonicalizationMethod.getParameterSpec()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
