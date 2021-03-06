package org.j8unit.repository.javax.swing.event;

import javax.swing.event.UndoableEditEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UndoableEditEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.UndoableEditEventTests}).
 */
@RunWith(J8Unit4.class)
public class UndoableEditEventTest
implements UndoableEditEventTests<UndoableEditEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.UndoableEditEvent]

    @Override
    public UndoableEditEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.UndoableEditEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.UndoableEditEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.UndoableEditEvent]

}
