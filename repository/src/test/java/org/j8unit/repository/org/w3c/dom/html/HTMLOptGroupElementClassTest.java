package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLOptGroupElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLOptGroupElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLOptGroupElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLOptGroupElementClassTest
implements HTMLOptGroupElementClassTests<HTMLOptGroupElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLOptGroupElement]

    @Override
    public Class<HTMLOptGroupElement> createNewSUT() {
        return HTMLOptGroupElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLOptGroupElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLOptGroupElement]

}
