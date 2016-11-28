package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLTableCellElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLTableCellElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLTableCellElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLTableCellElementClassTest
implements HTMLTableCellElementClassTests<HTMLTableCellElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLTableCellElement]

    @Override
    public Class<HTMLTableCellElement> createNewSUT() {
        return HTMLTableCellElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLTableCellElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLTableCellElement]

}
