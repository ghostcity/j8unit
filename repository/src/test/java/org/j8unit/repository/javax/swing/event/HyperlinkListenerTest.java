package org.j8unit.repository.javax.swing.event;

import javax.swing.event.HyperlinkListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HyperlinkListenerTest
implements org.j8unit.repository.javax.swing.event.HyperlinkListenerTests<HyperlinkListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.HyperlinkListener]

    @Override
    public HyperlinkListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.HyperlinkListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.HyperlinkListener]

}