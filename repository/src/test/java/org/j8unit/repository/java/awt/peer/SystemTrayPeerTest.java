package org.j8unit.repository.java.awt.peer;

import java.awt.peer.SystemTrayPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SystemTrayPeer} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.peer.SystemTrayPeerTests}).
 */
@RunWith(J8Unit4.class)
public class SystemTrayPeerTest
implements SystemTrayPeerTests<SystemTrayPeer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.peer.SystemTrayPeer]

    @Override
    public SystemTrayPeer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.peer.SystemTrayPeer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.peer.SystemTrayPeer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.peer.SystemTrayPeer]

}
