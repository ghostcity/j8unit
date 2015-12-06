package org.j8unit.repository.java.nio.channels;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.SocketChannel class java.nio.channels.SocketChannel}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.nio.channels.SocketChannelTests}.
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
 * @see org.j8unit.repository.java.nio.channels.SocketChannelTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SocketChannelClassTests<SUT extends Class<? extends java.nio.channels.SocketChannel>>
extends org.j8unit.repository.java.nio.channels.ByteChannelClassTests<SUT>, org.j8unit.repository.java.nio.channels.ScatteringByteChannelClassTests<SUT>,
org.j8unit.repository.java.nio.channels.GatheringByteChannelClassTests<SUT>, org.j8unit.repository.java.nio.channels.NetworkChannelClassTests<SUT>,
org.j8unit.repository.java.nio.channels.spi.AbstractSelectableChannelClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#open() public static java.nio.channels.SocketChannel
     * java.nio.channels.SocketChannel.open() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.SocketChannel#open(java.net.SocketAddress) public static
     * java.nio.channels.SocketChannel java.nio.channels.SocketChannel.open(java.net.SocketAddress) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open_SocketAddress()
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
        final Class<? extends java.nio.channels.SocketChannel> sut = createNewSUT();
        // assert assignability
        assertTrue(java.nio.channels.SocketChannel.class.isAssignableFrom(sut));
    }

}