package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReferenceClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.ReferenceClassTests<javax.xml.crypto.dsig.Reference> {

    @Override
    public Class<javax.xml.crypto.dsig.Reference> createNewSUT() {
        return javax.xml.crypto.dsig.Reference.class;
    }

}