package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.VM_TRUNCATABLE;

@RunWith(J8Unit4.class)
public class VM_TRUNCATABLETest
implements org.j8unit.repository.org.omg.CORBA.VM_TRUNCATABLETests<VM_TRUNCATABLE> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.VM_TRUNCATABLE]

    @Override
    public VM_TRUNCATABLE createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.VM_TRUNCATABLE], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.VM_TRUNCATABLE]

}