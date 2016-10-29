package org.j8unit.repository.javax.management;

import javax.management.DynamicMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynamicMBeanTest
implements org.j8unit.repository.javax.management.DynamicMBeanTests<DynamicMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.DynamicMBean]

    @Override
    public DynamicMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.DynamicMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.DynamicMBean]

}