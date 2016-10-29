package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLSignatureFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLSignatureFactoryTest
implements org.j8unit.repository.javax.xml.crypto.dsig.XMLSignatureFactoryTests<XMLSignatureFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignatureFactory]

    @Override
    public XMLSignatureFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.XMLSignatureFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignatureFactory]

}