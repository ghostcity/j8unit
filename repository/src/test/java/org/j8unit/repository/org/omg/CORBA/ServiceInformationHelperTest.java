package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.ServiceInformationHelper;

@RunWith(J8Unit4.class)
public class ServiceInformationHelperTest
implements org.j8unit.repository.org.omg.CORBA.ServiceInformationHelperTests<ServiceInformationHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ServiceInformationHelper]

    @Override
    public ServiceInformationHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.ServiceInformationHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ServiceInformationHelper]

}