package org.j8unit.repository.java.security.cert;

import static org.junit.Assert.fail;
import java.security.cert.CertStoreSpi;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertStoreSpi} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.CertStoreSpiClassTests}).
 */
@RunWith(J8Unit4.class)
public class CertStoreSpiClassTest
implements CertStoreSpiClassTests<CertStoreSpi> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertStoreSpi]

    @Override
    public Class<CertStoreSpi> createNewSUT() {
        return CertStoreSpi.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.cert.CertStoreSpi#CertStoreSpi(java.security.cert.CertStoreParameters) public
     * java.security.cert.CertStoreSpi(java.security.cert.CertStoreParameters) throws
     * java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_CertStoreSpi_CertStoreParameters()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertStoreSpi]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertStoreSpi]

}
