package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.UnsolicitedNotification;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnsolicitedNotification} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.UnsolicitedNotificationTests}).
 */
@RunWith(J8Unit4.class)
public class UnsolicitedNotificationTest
implements UnsolicitedNotificationTests<UnsolicitedNotification> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.ldap.UnsolicitedNotification]

    @Override
    public UnsolicitedNotification createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.ldap.UnsolicitedNotification], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.ldap.UnsolicitedNotification]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.ldap.UnsolicitedNotification]

}
