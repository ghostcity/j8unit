package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXAuthenticatorClassTest
implements org.j8unit.repository.javax.management.remote.JMXAuthenticatorClassTests<javax.management.remote.JMXAuthenticator> {

    @Override
    public Class<javax.management.remote.JMXAuthenticator> createNewSUT() {
        return javax.management.remote.JMXAuthenticator.class;
    }

}