package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLOutputFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLOutputFactoryTest
implements org.j8unit.repository.javax.xml.stream.XMLOutputFactoryTests<XMLOutputFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLOutputFactory]

    @Override
    public XMLOutputFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLOutputFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLOutputFactory]

}