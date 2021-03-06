package org.j8unit.repository.javax.management.remote;

import javax.management.remote.JMXConnectorServerFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JMXConnectorServerFactory} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.remote.JMXConnectorServerFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class JMXConnectorServerFactoryClassTest
implements JMXConnectorServerFactoryClassTests<JMXConnectorServerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.JMXConnectorServerFactory]

    @Override
    public Class<JMXConnectorServerFactory> createNewSUT() {
        return JMXConnectorServerFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.remote.JMXConnectorServerFactory#newJMXConnectorServer(javax.management.remote.JMXServiceURL, java.util.Map, javax.management.MBeanServer)
     * public static javax.management.remote.JMXConnectorServer
     * javax.management.remote.JMXConnectorServerFactory.newJMXConnectorServer(javax.management.remote.JMXServiceURL,java.util.Map<java.lang.String,
     * ?>,javax.management.MBeanServer) throws java.io.IOException}.
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
    public void test_newJMXConnectorServer_JMXServiceURL_Map_MBeanServer()
    throws Exception {
        // write some test for {@link
        // javax.management.remote.JMXConnectorServerFactory#newJMXConnectorServer(javax.management.remote.JMXServiceURL,
        // java.util.Map, javax.management.MBeanServer)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.JMXConnectorServerFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.JMXConnectorServerFactory]

}
