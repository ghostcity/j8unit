package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMImplementationSource;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMImplementationSource} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.DOMImplementationSourceClassTests}).
 */
@RunWith(J8Unit4.class)
public class DOMImplementationSourceClassTest
implements DOMImplementationSourceClassTests<DOMImplementationSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DOMImplementationSource]

    @Override
    public Class<DOMImplementationSource> createNewSUT() {
        return DOMImplementationSource.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DOMImplementationSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DOMImplementationSource]

}
