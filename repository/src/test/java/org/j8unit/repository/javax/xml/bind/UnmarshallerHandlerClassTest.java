package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmarshallerHandlerClassTest
implements org.j8unit.repository.javax.xml.bind.UnmarshallerHandlerClassTests<javax.xml.bind.UnmarshallerHandler> {

    @Override
    public Class<javax.xml.bind.UnmarshallerHandler> createNewSUT() {
        return javax.xml.bind.UnmarshallerHandler.class;
    }

}