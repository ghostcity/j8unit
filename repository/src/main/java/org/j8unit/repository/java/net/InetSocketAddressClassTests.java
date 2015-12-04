package org.j8unit.repository.java.net;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.net.InetSocketAddress class java.net.InetSocketAddress},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.net.InetSocketAddressTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.net.InetSocketAddressTests
 */
@Category(J8UnitRepository.class)
public abstract interface InetSocketAddressClassTests<SUT extends Class<? extends java.net.InetSocketAddress>>
extends org.j8unit.repository.java.net.SocketAddressClassTests<SUT>
{

    /**
     * Test method for {@link java.net.InetSocketAddress#InetSocketAddress(java.lang.String,int) public java.net.InetSocketAddress(java.lang.String,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InetSocketAddress_String_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.net.InetSocketAddress sut = null; // = new InetSocketAddress(java.lang.String,int);
    }

    /**
     * Test method for {@link java.net.InetSocketAddress#InetSocketAddress(java.net.InetAddress,int) public java.net.InetSocketAddress(java.net.InetAddress,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InetSocketAddress_InetAddress_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.net.InetSocketAddress sut = null; // = new InetSocketAddress(java.net.InetAddress,int);
    }

    /**
     * Test method for {@link java.net.InetSocketAddress#InetSocketAddress(int) public java.net.InetSocketAddress(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_InetSocketAddress_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.net.InetSocketAddress sut = null; // = new InetSocketAddress(int);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.net.InetSocketAddress> sut = createNewSUT();
        // assert assignability
        assertTrue(java.net.InetSocketAddress.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.net.InetSocketAddress#createUnresolved(java.lang.String,int) public static java.net.InetSocketAddress java.net.InetSocketAddress.createUnresolved(java.lang.String,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createUnresolved_String_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
