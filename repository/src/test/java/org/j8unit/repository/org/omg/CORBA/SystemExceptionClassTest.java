package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.SystemException;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SystemException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.SystemExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class SystemExceptionClassTest
implements SystemExceptionClassTests<SystemException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.SystemException]

    @Override
    public Class<SystemException> createNewSUT() {
        return SystemException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.SystemException]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.SystemException]

}
