package org.j8unit.repository.javax.xml.transform.sax;

import javax.xml.transform.sax.TransformerHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TransformerHandler} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.sax.TransformerHandlerTests}).
 */
@RunWith(J8Unit4.class)
public class TransformerHandlerTest
implements TransformerHandlerTests<TransformerHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.sax.TransformerHandler]

    @Override
    public TransformerHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.transform.sax.TransformerHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.sax.TransformerHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.sax.TransformerHandler]

}
