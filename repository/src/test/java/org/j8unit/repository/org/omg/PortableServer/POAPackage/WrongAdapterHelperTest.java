package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAPackage.WrongAdapterHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WrongAdapterHelper} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongAdapterHelperTests}).
 */
@RunWith(J8Unit4.class)
public class WrongAdapterHelperTest
implements WrongAdapterHelperTests<WrongAdapterHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAPackage.WrongAdapterHelper]

    @Override
    public WrongAdapterHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.POAPackage.WrongAdapterHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.POAPackage.WrongAdapterHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.POAPackage.WrongAdapterHelper]

}
