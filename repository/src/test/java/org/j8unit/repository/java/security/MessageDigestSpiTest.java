package org.j8unit.repository.java.security;

import java.security.MessageDigestSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MessageDigestSpi} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.MessageDigestSpiTests}).
 */

@RunWith(J8Unit4.class)
public class MessageDigestSpiTest
implements MessageDigestSpiTests<MessageDigestSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.MessageDigestSpi]

    @Override
    public MessageDigestSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.MessageDigestSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.MessageDigestSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.MessageDigestSpi]

}
