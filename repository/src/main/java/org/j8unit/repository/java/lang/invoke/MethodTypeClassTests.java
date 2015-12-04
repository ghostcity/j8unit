package org.j8unit.repository.java.lang.invoke;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.invoke.MethodType class java.lang.invoke.MethodType},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.lang.invoke.MethodTypeTests}.
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
 * @see org.j8unit.repository.java.lang.invoke.MethodTypeTests
 */
@Category(J8UnitRepository.class)
public abstract interface MethodTypeClassTests<SUT extends Class<? extends java.lang.invoke.MethodType>>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.lang.invoke.MethodType> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.invoke.MethodType.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodType#methodType(java.lang.Class,java.lang.invoke.MethodType) public static java.lang.invoke.MethodType java.lang.invoke.MethodType.methodType(java.lang.Class,java.lang.invoke.MethodType)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_methodType_Class_MethodType() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodType#methodType(java.lang.Class,java.lang.Class) public static java.lang.invoke.MethodType java.lang.invoke.MethodType.methodType(java.lang.Class,java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_methodType_Class_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodType#methodType(java.lang.Class,java.util.List) public static java.lang.invoke.MethodType java.lang.invoke.MethodType.methodType(java.lang.Class,java.util.List)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_methodType_Class_List() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodType#methodType(java.lang.Class,java.lang.Class,java.lang.Class...) public static java.lang.invoke.MethodType java.lang.invoke.MethodType.methodType(java.lang.Class,java.lang.Class,java.lang.Class...)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_methodType_Class_Class_ClassArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodType#methodType(java.lang.Class,java.lang.Class[]) public static java.lang.invoke.MethodType java.lang.invoke.MethodType.methodType(java.lang.Class,java.lang.Class[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_methodType_Class_ClassArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodType#methodType(java.lang.Class) public static java.lang.invoke.MethodType java.lang.invoke.MethodType.methodType(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_methodType_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodType#fromMethodDescriptorString(java.lang.String,java.lang.ClassLoader) public static java.lang.invoke.MethodType java.lang.invoke.MethodType.fromMethodDescriptorString(java.lang.String,java.lang.ClassLoader) throws java.lang.IllegalArgumentException,java.lang.TypeNotPresentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fromMethodDescriptorString_String_ClassLoader() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodType#genericMethodType(int) public static java.lang.invoke.MethodType java.lang.invoke.MethodType.genericMethodType(int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_genericMethodType_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodType#genericMethodType(int,boolean) public static java.lang.invoke.MethodType java.lang.invoke.MethodType.genericMethodType(int,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_genericMethodType_int_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
