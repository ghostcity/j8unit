package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.IRObjectOperations;

@RunWith(J8Unit4.class)
public class IRObjectOperationsTest
implements org.j8unit.repository.org.omg.CORBA.IRObjectOperationsTests<IRObjectOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.IRObjectOperations]

    @Override
    public IRObjectOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.IRObjectOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.IRObjectOperations]

}