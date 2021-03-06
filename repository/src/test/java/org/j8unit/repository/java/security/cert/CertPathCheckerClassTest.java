package org.j8unit.repository.java.security.cert;

import java.security.cert.CertPathChecker;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CertPathChecker} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.CertPathCheckerClassTests}).
 */
@RunWith(J8Unit4.class)
public class CertPathCheckerClassTest
implements CertPathCheckerClassTests<CertPathChecker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CertPathChecker]

    @Override
    public Class<CertPathChecker> createNewSUT() {
        return CertPathChecker.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CertPathChecker]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CertPathChecker]

}
