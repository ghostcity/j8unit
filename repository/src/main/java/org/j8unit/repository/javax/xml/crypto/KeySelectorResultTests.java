package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.KeySelectorResult interface javax.xml.crypto.KeySelectorResult}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.KeySelectorResultClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface KeySelectorResultTests<SUT extends javax.xml.crypto.KeySelectorResult>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.KeySelectorResult#getKey() public abstract java.security.Key
     * javax.xml.crypto.KeySelectorResult.getKey()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
