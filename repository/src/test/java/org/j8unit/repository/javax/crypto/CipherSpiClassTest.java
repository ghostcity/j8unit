package org.j8unit.repository.javax.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CipherSpiClassTest
implements org.j8unit.repository.javax.crypto.CipherSpiClassTests<javax.crypto.CipherSpi> {

    @Override
    public Class<javax.crypto.CipherSpi> createNewSUT() {
        return javax.crypto.CipherSpi.class;
    }

}