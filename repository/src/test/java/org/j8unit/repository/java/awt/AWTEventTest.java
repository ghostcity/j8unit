package org.j8unit.repository.java.awt;

import java.awt.AWTEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AWTEventTest
implements org.j8unit.repository.java.awt.AWTEventTests<AWTEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.AWTEvent]

    @Override
    public AWTEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.AWTEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.AWTEvent]

}