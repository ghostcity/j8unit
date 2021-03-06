package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.RespectBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RespectBinding} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.RespectBindingTests}).
 */
@RunWith(J8Unit4.class)
public class RespectBindingTest
implements RespectBindingTests<RespectBinding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.RespectBinding]

    @Override
    public RespectBinding createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.RespectBinding], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.RespectBinding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.RespectBinding]

}
