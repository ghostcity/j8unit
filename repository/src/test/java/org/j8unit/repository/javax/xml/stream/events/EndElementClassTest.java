package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.EndElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EndElement} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.stream.events.EndElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class EndElementClassTest
implements EndElementClassTests<EndElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.EndElement]

    @Override
    public Class<EndElement> createNewSUT() {
        return EndElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.EndElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.EndElement]

}
