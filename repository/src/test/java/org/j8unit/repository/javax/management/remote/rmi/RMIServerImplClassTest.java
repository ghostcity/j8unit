package org.j8unit.repository.javax.management.remote.rmi;

import static org.junit.Assert.fail;
import javax.management.remote.rmi.RMIServerImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RMIServerImpl} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.remote.rmi.RMIServerImplClassTests}).
 */
@RunWith(J8Unit4.class)
public class RMIServerImplClassTest
implements RMIServerImplClassTests<RMIServerImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi.RMIServerImpl]

    @Override
    public Class<RMIServerImpl> createNewSUT() {
        return RMIServerImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.rmi.RMIServerImpl#RMIServerImpl(java.util.Map) public
     * javax.management.remote.rmi.RMIServerImpl(java.util.Map<java.lang.String, ?>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_RMIServerImpl_Map()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.rmi.RMIServerImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi.RMIServerImpl]

}
