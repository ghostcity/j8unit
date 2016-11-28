package org.j8unit.repository.javax.crypto;

import javax.crypto.MacSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MacSpi} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.crypto.MacSpiTests}).
 */
@RunWith(J8Unit4.class)
public class MacSpiTest
implements MacSpiTests<MacSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.MacSpi]

    @Override
    public MacSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.MacSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.MacSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.MacSpi]

}
