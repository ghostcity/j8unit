package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.CTX_RESTRICT_SCOPE;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CTX_RESTRICT_SCOPE} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.CTX_RESTRICT_SCOPETests}).
 */
@RunWith(J8Unit4.class)
public class CTX_RESTRICT_SCOPETest
implements CTX_RESTRICT_SCOPETests<CTX_RESTRICT_SCOPE> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.CTX_RESTRICT_SCOPE]

    @Override
    public CTX_RESTRICT_SCOPE createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.CTX_RESTRICT_SCOPE], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.CTX_RESTRICT_SCOPE]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.CTX_RESTRICT_SCOPE]

}
