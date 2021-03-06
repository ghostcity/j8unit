package org.j8unit.repository.javax.xml.ws.handler.soap;

import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SOAPHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.handler.soap.SOAPHandlerTests}).
 */
@RunWith(J8Unit4.class)
public class SOAPHandlerTest<T extends SOAPMessageContext>
implements SOAPHandlerTests<SOAPHandler<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.soap.SOAPHandler]

    @Override
    public SOAPHandler<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.handler.soap.SOAPHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.handler.soap.SOAPHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.handler.soap.SOAPHandler]

}
