package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.ECPublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPublicKeyTest
implements org.j8unit.repository.java.security.interfaces.ECPublicKeyTests<ECPublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.ECPublicKey]

    @Override
    public ECPublicKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.ECPublicKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.ECPublicKey]

}