package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXConnectionNotificationClassTest
implements org.j8unit.repository.javax.management.remote.JMXConnectionNotificationClassTests<javax.management.remote.JMXConnectionNotification> {

    @Override
    public Class<javax.management.remote.JMXConnectionNotification> createNewSUT() {
        return javax.management.remote.JMXConnectionNotification.class;
    }

}