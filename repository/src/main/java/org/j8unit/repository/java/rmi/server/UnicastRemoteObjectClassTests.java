package org.j8unit.repository.java.rmi.server;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.server.UnicastRemoteObject class java.rmi.server.UnicastRemoteObject}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.rmi.server.UnicastRemoteObjectTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.server.UnicastRemoteObjectTests
 */
@Category(J8UnitRepository.class)
public abstract interface UnicastRemoteObjectClassTests<SUT extends Class<? extends java.rmi.server.UnicastRemoteObject>>
extends org.j8unit.repository.java.rmi.server.RemoteServerClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.UnicastRemoteObject#exportObject(java.rmi.Remote) public static
     * java.rmi.server.RemoteStub java.rmi.server.UnicastRemoteObject.exportObject(java.rmi.Remote) throws
     * java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportObject_Remote()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.UnicastRemoteObject#exportObject(java.rmi.Remote,int) public static
     * java.rmi.Remote java.rmi.server.UnicastRemoteObject.exportObject(java.rmi.Remote,int) throws
     * java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportObject_Remote_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.server.UnicastRemoteObject#exportObject(java.rmi.Remote,int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory)
     * public static java.rmi.Remote
     * java.rmi.server.UnicastRemoteObject.exportObject(java.rmi.Remote,int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory)
     * throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportObject_Remote_int_RMIClientSocketFactory_RMIServerSocketFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.UnicastRemoteObject#unexportObject(java.rmi.Remote,boolean) public static
     * boolean java.rmi.server.UnicastRemoteObject.unexportObject(java.rmi.Remote,boolean) throws
     * java.rmi.NoSuchObjectException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unexportObject_Remote_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.rmi.server.UnicastRemoteObject> sut = createNewSUT();
        // assert assignability
        assertTrue(java.rmi.server.UnicastRemoteObject.class.isAssignableFrom(sut));
    }

}
