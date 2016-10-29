package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.TrustManagerFactorySpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrustManagerFactorySpiTest
implements org.j8unit.repository.javax.net.ssl.TrustManagerFactorySpiTests<TrustManagerFactorySpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.TrustManagerFactorySpi]

    @Override
    public TrustManagerFactorySpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.TrustManagerFactorySpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.TrustManagerFactorySpi]

}