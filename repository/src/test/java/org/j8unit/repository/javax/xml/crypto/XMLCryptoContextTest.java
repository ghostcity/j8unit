package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.XMLCryptoContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLCryptoContextTest
implements org.j8unit.repository.javax.xml.crypto.XMLCryptoContextTests<XMLCryptoContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.XMLCryptoContext]

    @Override
    public XMLCryptoContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.XMLCryptoContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.XMLCryptoContext]

}