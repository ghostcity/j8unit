package org.j8unit.repository.java.awt.peer;

import java.awt.peer.ListPeer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ListPeer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.peer.ListPeerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ListPeerClassTest
implements ListPeerClassTests<ListPeer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.peer.ListPeer]

    @Override
    public Class<ListPeer> createNewSUT() {
        return ListPeer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.peer.ListPeer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.peer.ListPeer]

}
