package org.j8unit.repository.javax.xml.parsers;

import javax.xml.parsers.SAXParserFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SAXParserFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.parsers.SAXParserFactoryTests}).
 */
@RunWith(J8Unit4.class)
public class SAXParserFactoryTest
implements SAXParserFactoryTests<SAXParserFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.parsers.SAXParserFactory]

    @Override
    public SAXParserFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.parsers.SAXParserFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.parsers.SAXParserFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.parsers.SAXParserFactory]

}
