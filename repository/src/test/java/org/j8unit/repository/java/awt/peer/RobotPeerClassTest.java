package org.j8unit.repository.java.awt.peer;

import java.awt.peer.RobotPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RobotPeer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.peer.RobotPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class RobotPeerClassTest
implements RobotPeerClassTests<RobotPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.RobotPeer]

    @Override
    public Class<RobotPeer> createNewSUT() {
        return RobotPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.RobotPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.RobotPeer]

}
