package org.j8unit.repository.java.beans;

import java.beans.DesignMode;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DesignModeTest
implements org.j8unit.repository.java.beans.DesignModeTests<DesignMode> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.DesignMode]

    @Override
    public DesignMode createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.DesignMode], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.DesignMode]

}