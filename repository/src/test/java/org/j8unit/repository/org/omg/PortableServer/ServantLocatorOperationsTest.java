package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantLocatorOperations;

@RunWith(J8Unit4.class)
public class ServantLocatorOperationsTest
implements org.j8unit.repository.org.omg.PortableServer.ServantLocatorOperationsTests<ServantLocatorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantLocatorOperations]

    @Override
    public ServantLocatorOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.ServantLocatorOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantLocatorOperations]

}