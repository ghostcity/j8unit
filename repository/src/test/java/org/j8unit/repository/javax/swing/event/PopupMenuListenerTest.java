package org.j8unit.repository.javax.swing.event;

import javax.swing.event.PopupMenuListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PopupMenuListenerTest
implements org.j8unit.repository.javax.swing.event.PopupMenuListenerTests<PopupMenuListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.PopupMenuListener]

    @Override
    public PopupMenuListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.PopupMenuListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.PopupMenuListener]

}