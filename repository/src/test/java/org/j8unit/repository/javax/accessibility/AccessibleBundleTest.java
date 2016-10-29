package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleBundle;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleBundleTest
implements org.j8unit.repository.javax.accessibility.AccessibleBundleTests<AccessibleBundle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleBundle]

    @Override
    public AccessibleBundle createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleBundle], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleBundle]

}