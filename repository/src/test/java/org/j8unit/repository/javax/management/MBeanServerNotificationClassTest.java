package org.j8unit.repository.javax.management;

import javax.management.MBeanServerNotification;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerNotificationClassTest
implements org.j8unit.repository.javax.management.MBeanServerNotificationClassTests<MBeanServerNotification> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanServerNotification]

    @Override
    public Class<MBeanServerNotification> createNewSUT() {
        return MBeanServerNotification.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanServerNotification#MBeanServerNotification(String, Object, long, javax.management.ObjectName)
     * public
     * javax.management.MBeanServerNotification(java.lang.String,java.lang.Object,long,javax.management.ObjectName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_MBeanServerNotification_String_Object_long_ObjectName()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanServerNotification sut = null; // = new MBeanServerNotification(String, Object, long,
                                                  // javax.management.ObjectName);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanServerNotification]

}
