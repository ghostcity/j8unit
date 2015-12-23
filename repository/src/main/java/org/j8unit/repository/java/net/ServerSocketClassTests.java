package org.j8unit.repository.java.net;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.net.ServerSocket class java.net.ServerSocket}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.net.ServerSocketTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.java.net.ServerSocketTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.net.ServerSocket
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServerSocketClassTests<SUT extends java.net.ServerSocket>
extends org.j8unit.repository.java.io.CloseableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.ServerSocket#ServerSocket() public java.net.ServerSocket() throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.ServerSocket#ServerSocket()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServerSocket()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.ServerSocket sut = null; // = new ServerSocket();
    }

    /**
     * <p>
     * Test method for {@link java.net.ServerSocket#ServerSocket(int) public java.net.ServerSocket(int) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.ServerSocket#ServerSocket(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServerSocket_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.ServerSocket sut = null; // = new ServerSocket(int);
    }

    /**
     * <p>
     * Test method for {@link java.net.ServerSocket#ServerSocket(int, int) public java.net.ServerSocket(int,int) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.ServerSocket#ServerSocket(int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServerSocket_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.ServerSocket sut = null; // = new ServerSocket(int, int);
    }

    /**
     * <p>
     * Test method for {@link java.net.ServerSocket#ServerSocket(int, int, java.net.InetAddress) public
     * java.net.ServerSocket(int,int,java.net.InetAddress) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.ServerSocket#ServerSocket(int, int, java.net.InetAddress)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServerSocket_int_int_InetAddress()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.net.ServerSocket sut = null; // = new ServerSocket(int, int, java.net.InetAddress);
    }

    /**
     * <p>
     * Test method for {@link java.net.ServerSocket#setSocketFactory(java.net.SocketImplFactory) public static
     * synchronized void java.net.ServerSocket.setSocketFactory(java.net.SocketImplFactory) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.ServerSocket#setSocketFactory(java.net.SocketImplFactory)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSocketFactory_SocketImplFactory()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.net.ServerSocket#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.net.ServerSocket.class.isAssignableFrom(sut));
    }

}
