package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.remote.rmi.RMIServerImpl_Stub class
 * javax.management.remote.rmi.RMIServerImpl_Stub}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.remote.rmi.RMIServerImpl_StubTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.remote.rmi.RMIServerImpl_StubClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.remote.rmi.RMIServerImpl_Stub
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIServerImpl_StubTests<SUT extends javax.management.remote.rmi.RMIServerImpl_Stub>
extends org.j8unit.repository.javax.management.remote.rmi.RMIServerTests<SUT>, org.j8unit.repository.java.rmi.server.RemoteStubTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl_Stub#getVersion() public java.lang.String
     * javax.management.remote.rmi.RMIServerImpl_Stub.getVersion() throws java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.remote.rmi.RMIServerImpl_Stub#getVersion()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl_Stub#newClient(java.lang.Object) public
     * javax.management.remote.rmi.RMIConnection
     * javax.management.remote.rmi.RMIServerImpl_Stub.newClient(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.remote.rmi.RMIServerImpl_Stub#newClient(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_newClient_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
