package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLStreamWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLStreamWriter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.XMLStreamWriterTests}).
 */
@RunWith(J8Unit4.class)
public class XMLStreamWriterTest
implements XMLStreamWriterTests<XMLStreamWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLStreamWriter]

    @Override
    public XMLStreamWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLStreamWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.XMLStreamWriter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.XMLStreamWriter]

}
