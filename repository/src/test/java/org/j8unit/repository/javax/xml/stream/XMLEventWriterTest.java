package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLEventWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLEventWriter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.XMLEventWriterTests}).
 */
@RunWith(J8Unit4.class)
public class XMLEventWriterTest
implements XMLEventWriterTests<XMLEventWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLEventWriter]

    @Override
    public XMLEventWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLEventWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.XMLEventWriter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.XMLEventWriter]

}
