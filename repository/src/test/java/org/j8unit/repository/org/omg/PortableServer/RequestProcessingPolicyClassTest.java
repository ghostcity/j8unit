package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RequestProcessingPolicyClassTest
implements org.j8unit.repository.org.omg.PortableServer.RequestProcessingPolicyClassTests<org.omg.PortableServer.RequestProcessingPolicy> {

    @Override
    public Class<org.omg.PortableServer.RequestProcessingPolicy> createNewSUT() {
        return org.omg.PortableServer.RequestProcessingPolicy.class;
    }

}