package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.InterceptorOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InterceptorOperations} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.PortableInterceptor.InterceptorOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class InterceptorOperationsClassTest
implements InterceptorOperationsClassTests<InterceptorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.InterceptorOperations]

    @Override
    public Class<InterceptorOperations> createNewSUT() {
        return InterceptorOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.InterceptorOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.InterceptorOperations]

}
