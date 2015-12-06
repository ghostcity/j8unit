package org.j8unit.repository.java.rmi.server;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.server.RMISocketFactory class java.rmi.server.RMISocketFactory}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.rmi.server.RMISocketFactoryTests}.
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
 * @see org.j8unit.repository.java.rmi.server.RMISocketFactoryTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMISocketFactoryClassTests<SUT extends Class<? extends java.rmi.server.RMISocketFactory>>
extends org.j8unit.repository.java.rmi.server.RMIClientSocketFactoryClassTests<SUT>,
org.j8unit.repository.java.rmi.server.RMIServerSocketFactoryClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.rmi.server.RMISocketFactory#RMISocketFactory() public
     * java.rmi.server.RMISocketFactory()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_RMISocketFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.rmi.server.RMISocketFactory sut = null; // = new RMISocketFactory();
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMISocketFactory#getDefaultSocketFactory() public static synchronized
     * java.rmi.server.RMISocketFactory java.rmi.server.RMISocketFactory.getDefaultSocketFactory()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultSocketFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMISocketFactory#getFailureHandler() public static synchronized
     * java.rmi.server.RMIFailureHandler java.rmi.server.RMISocketFactory.getFailureHandler()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFailureHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMISocketFactory#getSocketFactory() public static synchronized
     * java.rmi.server.RMISocketFactory java.rmi.server.RMISocketFactory.getSocketFactory()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSocketFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMISocketFactory#setFailureHandler(java.rmi.server.RMIFailureHandler)
     * public static synchronized void
     * java.rmi.server.RMISocketFactory.setFailureHandler(java.rmi.server.RMIFailureHandler)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFailureHandler_RMIFailureHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RMISocketFactory#setSocketFactory(java.rmi.server.RMISocketFactory) public
     * static synchronized void java.rmi.server.RMISocketFactory.setSocketFactory(java.rmi.server.RMISocketFactory)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSocketFactory_RMISocketFactory()
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
        final Class<? extends java.rmi.server.RMISocketFactory> sut = createNewSUT();
        // assert assignability
        assertTrue(java.rmi.server.RMISocketFactory.class.isAssignableFrom(sut));
    }

}