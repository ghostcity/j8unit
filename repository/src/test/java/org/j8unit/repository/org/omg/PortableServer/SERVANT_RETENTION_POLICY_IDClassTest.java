package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SERVANT_RETENTION_POLICY_ID} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.SERVANT_RETENTION_POLICY_IDClassTests}).
 */
@RunWith(J8Unit4.class)
public class SERVANT_RETENTION_POLICY_IDClassTest
implements SERVANT_RETENTION_POLICY_IDClassTests<SERVANT_RETENTION_POLICY_ID> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID]

    @Override
    public Class<SERVANT_RETENTION_POLICY_ID> createNewSUT() {
        return SERVANT_RETENTION_POLICY_ID.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID]

}
