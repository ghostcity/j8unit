package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPFactoryClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPFactoryClassTests<javax.xml.soap.SOAPFactory> {

    @Override
    public Class<javax.xml.soap.SOAPFactory> createNewSUT() {
        return javax.xml.soap.SOAPFactory.class;
    }

}