package org.j8unit.repository.javax.management.loading;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.loading.PrivateMLet class javax.management.loading.PrivateMLet},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.management.loading.PrivateMLetTests}.
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
 * @see org.j8unit.repository.javax.management.loading.PrivateMLetTests
 */
@Category(J8UnitRepository.class)
public abstract interface PrivateMLetClassTests<SUT extends Class<? extends javax.management.loading.PrivateMLet>>
extends org.j8unit.repository.javax.management.loading.PrivateClassLoaderClassTests<SUT>,
        org.j8unit.repository.javax.management.loading.MLetClassTests<SUT>
{

    /**
     * Test method for {@link javax.management.loading.PrivateMLet#PrivateMLet(java.net.URL[],boolean) public javax.management.loading.PrivateMLet(java.net.URL[],boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrivateMLet_URLArray_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.loading.PrivateMLet sut = null; // = new PrivateMLet(java.net.URL[],boolean);
    }

    /**
     * Test method for {@link javax.management.loading.PrivateMLet#PrivateMLet(java.net.URL[],java.lang.ClassLoader,boolean) public javax.management.loading.PrivateMLet(java.net.URL[],java.lang.ClassLoader,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrivateMLet_URLArray_ClassLoader_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.loading.PrivateMLet sut = null; // = new PrivateMLet(java.net.URL[],java.lang.ClassLoader,boolean);
    }

    /**
     * Test method for {@link javax.management.loading.PrivateMLet#PrivateMLet(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory,boolean) public javax.management.loading.PrivateMLet(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory,boolean)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_PrivateMLet_URLArray_ClassLoader_URLStreamHandlerFactory_boolean() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.loading.PrivateMLet sut = null; // = new PrivateMLet(java.net.URL[],java.lang.ClassLoader,java.net.URLStreamHandlerFactory,boolean);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.management.loading.PrivateMLet> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.loading.PrivateMLet.class.isAssignableFrom(sut));
    }

}
