package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLFieldSetElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLFieldSetElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLFieldSetElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLFieldSetElementClassTest
implements HTMLFieldSetElementClassTests<HTMLFieldSetElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLFieldSetElement]

    @Override
    public Class<HTMLFieldSetElement> createNewSUT() {
        return HTMLFieldSetElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLFieldSetElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLFieldSetElement]

}
