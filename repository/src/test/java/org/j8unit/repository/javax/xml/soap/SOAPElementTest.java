package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPElementTest
implements org.j8unit.repository.javax.xml.soap.SOAPElementTests<SOAPElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPElement]

    @Override
    public SOAPElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.SOAPElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.SOAPElement]

}