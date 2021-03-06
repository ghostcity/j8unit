package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLServerSocket;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SSLServerSocket} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.SSLServerSocketClassTests}).
 */
@RunWith(J8Unit4.class)
public class SSLServerSocketClassTest
implements SSLServerSocketClassTests<SSLServerSocket> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLServerSocket]

    @Override
    public Class<SSLServerSocket> createNewSUT() {
        return SSLServerSocket.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLServerSocket]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLServerSocket]

}
