package org.j8unit.repository.javax.management;

import javax.management.MBeanServer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerTest
implements org.j8unit.repository.javax.management.MBeanServerTests<MBeanServer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanServer]

    @Override
    public MBeanServer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.MBeanServer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanServer]

}