package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.ValidationEventHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ValidationEventHandler} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.ValidationEventHandlerTests}).
 */
@RunWith(J8Unit4.class)
public class ValidationEventHandlerTest
implements ValidationEventHandlerTests<ValidationEventHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.ValidationEventHandler]

    @Override
    public ValidationEventHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.ValidationEventHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.ValidationEventHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.ValidationEventHandler]

}
