package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.UNSUPPORTED_POLICY;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UNSUPPORTED_POLICY} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.UNSUPPORTED_POLICYClassTests}).
 */
@RunWith(J8Unit4.class)
public class UNSUPPORTED_POLICYClassTest
implements UNSUPPORTED_POLICYClassTests<UNSUPPORTED_POLICY> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.UNSUPPORTED_POLICY]

    @Override
    public Class<UNSUPPORTED_POLICY> createNewSUT() {
        return UNSUPPORTED_POLICY.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.UNSUPPORTED_POLICY]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.UNSUPPORTED_POLICY]

}
