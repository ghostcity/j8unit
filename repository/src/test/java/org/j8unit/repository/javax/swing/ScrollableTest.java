package org.j8unit.repository.javax.swing;

import javax.swing.Scrollable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScrollableTest
implements org.j8unit.repository.javax.swing.ScrollableTests<Scrollable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Scrollable]

    @Override
    public Scrollable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.Scrollable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Scrollable]

}