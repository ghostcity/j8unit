package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.PortInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PortInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.handler.PortInfoTests}).
 */
@RunWith(J8Unit4.class)
public class PortInfoTest
implements PortInfoTests<PortInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.PortInfo]

    @Override
    public PortInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.handler.PortInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.handler.PortInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.handler.PortInfo]

}
