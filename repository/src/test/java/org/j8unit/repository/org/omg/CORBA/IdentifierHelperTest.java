package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.IdentifierHelper;

@RunWith(J8Unit4.class)
public class IdentifierHelperTest
implements org.j8unit.repository.org.omg.CORBA.IdentifierHelperTests<IdentifierHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.IdentifierHelper]

    @Override
    public IdentifierHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.IdentifierHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.IdentifierHelper]

}