package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLSocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLSocketFactoryTest
implements org.j8unit.repository.javax.net.ssl.SSLSocketFactoryTests<SSLSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLSocketFactory]

    @Override
    public SSLSocketFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.SSLSocketFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.SSLSocketFactory]

}