package org.j8unit.repository.javax.swing.event;

import javax.swing.event.DocumentListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.DocumentListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class DocumentListenerClassTest
implements DocumentListenerClassTests<DocumentListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.DocumentListener]

    @Override
    public Class<DocumentListener> createNewSUT() {
        return DocumentListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.DocumentListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.DocumentListener]

}
