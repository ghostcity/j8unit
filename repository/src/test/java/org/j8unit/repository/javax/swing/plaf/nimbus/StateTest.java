package org.j8unit.repository.javax.swing.plaf.nimbus;

import javax.swing.JComponent;
import javax.swing.plaf.nimbus.State;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StateTest<T extends JComponent>
implements org.j8unit.repository.javax.swing.plaf.nimbus.StateTests<State<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.nimbus.State]

    @Override
    public State<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.nimbus.State], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.nimbus.State]

}