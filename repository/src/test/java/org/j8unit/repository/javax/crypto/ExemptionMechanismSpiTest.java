package org.j8unit.repository.javax.crypto;

import javax.crypto.ExemptionMechanismSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExemptionMechanismSpiTest
implements org.j8unit.repository.javax.crypto.ExemptionMechanismSpiTests<ExemptionMechanismSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.ExemptionMechanismSpi]

    @Override
    public ExemptionMechanismSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.crypto.ExemptionMechanismSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.ExemptionMechanismSpi]

}