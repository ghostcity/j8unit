package org.j8unit.repository.java.security.interfaces;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.interfaces.ECPrivateKey interface java.security.interfaces.ECPrivateKey},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.interfaces.ECPrivateKeyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ECPrivateKeyTests<SUT extends java.security.interfaces.ECPrivateKey>
extends org.j8unit.repository.java.security.PrivateKeyTests<SUT>, org.j8unit.repository.java.security.interfaces.ECKeyTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.interfaces.ECPrivateKey#getS() public abstract java.math.BigInteger
     * java.security.interfaces.ECPrivateKey.getS()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getS()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
