package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIClassLoaderSpiClassTest
implements org.j8unit.repository.java.rmi.server.RMIClassLoaderSpiClassTests<java.rmi.server.RMIClassLoaderSpi> {

    @Override
    public Class<java.rmi.server.RMIClassLoaderSpi> createNewSUT() {
        return java.rmi.server.RMIClassLoaderSpi.class;
    }

}