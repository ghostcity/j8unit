package org.j8unit.repository.javax.crypto;

import javax.crypto.EncryptedPrivateKeyInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EncryptedPrivateKeyInfo} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.crypto.EncryptedPrivateKeyInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class EncryptedPrivateKeyInfoClassTest
implements EncryptedPrivateKeyInfoClassTests<EncryptedPrivateKeyInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.EncryptedPrivateKeyInfo]

    @Override
    public Class<EncryptedPrivateKeyInfo> createNewSUT() {
        return EncryptedPrivateKeyInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.EncryptedPrivateKeyInfo#EncryptedPrivateKeyInfo(String, byte[]) public
     * javax.crypto.EncryptedPrivateKeyInfo(java.lang.String,byte[]) throws java.security.NoSuchAlgorithmException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_EncryptedPrivateKeyInfo_String_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EncryptedPrivateKeyInfo sut = null; // = new EncryptedPrivateKeyInfo(String, byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.EncryptedPrivateKeyInfo#EncryptedPrivateKeyInfo(byte[]) public
     * javax.crypto.EncryptedPrivateKeyInfo(byte[]) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_EncryptedPrivateKeyInfo_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EncryptedPrivateKeyInfo sut = null; // = new EncryptedPrivateKeyInfo(byte[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.EncryptedPrivateKeyInfo#EncryptedPrivateKeyInfo(java.security.AlgorithmParameters, byte[])
     * public javax.crypto.EncryptedPrivateKeyInfo(java.security.AlgorithmParameters,byte[]) throws
     * java.security.NoSuchAlgorithmException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_EncryptedPrivateKeyInfo_AlgorithmParameters_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EncryptedPrivateKeyInfo sut = null; // = new EncryptedPrivateKeyInfo(java.security.AlgorithmParameters,
                                                  // byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.EncryptedPrivateKeyInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.EncryptedPrivateKeyInfo]

}
