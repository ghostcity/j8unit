package org.j8unit.repository.java.awt.event;

import java.awt.event.TextListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TextListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.TextListenerTests}).
 */
@RunWith(J8Unit4.class)
public class TextListenerTest
implements TextListenerTests<TextListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.TextListener]

    @Override
    public TextListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.TextListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.TextListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.TextListener]

}
