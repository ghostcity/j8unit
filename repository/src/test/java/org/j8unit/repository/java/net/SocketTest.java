package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketTest
implements org.j8unit.repository.java.net.SocketTests<java.net.Socket> {

    @Override
    public java.net.Socket createNewSUT() {
        return new java.net.Socket();
    }

}