package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link POAOperations} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.POAOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class POAOperationsClassTest
implements POAOperationsClassTests<POAOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAOperations]

    @Override
    public Class<POAOperations> createNewSUT() {
        return POAOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.POAOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAOperations]

}
