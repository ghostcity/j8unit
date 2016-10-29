package org.j8unit.repository.java.nio.channels;

import java.nio.channels.ServerSocketChannel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerSocketChannelTest
implements org.j8unit.repository.java.nio.channels.ServerSocketChannelTests<ServerSocketChannel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.ServerSocketChannel]

    @Override
    public ServerSocketChannel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.ServerSocketChannel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.ServerSocketChannel]

}