package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.ServiceContextHelper;

@RunWith(J8Unit4.class)
public class ServiceContextHelperTest
implements org.j8unit.repository.org.omg.IOP.ServiceContextHelperTests<ServiceContextHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.ServiceContextHelper]

    @Override
    public ServiceContextHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.ServiceContextHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.ServiceContextHelper]

}