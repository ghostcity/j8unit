package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIIIOPServerImplClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIIIOPServerImplClassTests<javax.management.remote.rmi.RMIIIOPServerImpl> {

    @Override
    public Class<javax.management.remote.rmi.RMIIIOPServerImpl> createNewSUT() {
        return javax.management.remote.rmi.RMIIIOPServerImpl.class;
    }

}