package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.UserDataHandler;

@RunWith(J8Unit4.class)
public class UserDataHandlerTest
implements org.j8unit.repository.org.w3c.dom.UserDataHandlerTests<UserDataHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.UserDataHandler]

    @Override
    public UserDataHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.UserDataHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.UserDataHandler]

}