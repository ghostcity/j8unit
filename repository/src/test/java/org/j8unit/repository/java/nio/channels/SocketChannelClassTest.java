package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketChannelClassTest
implements org.j8unit.repository.java.nio.channels.SocketChannelClassTests<java.nio.channels.SocketChannel> {

    @Override
    public Class<java.nio.channels.SocketChannel> createNewSUT() {
        return java.nio.channels.SocketChannel.class;
    }

}