package org.j8unit.repository.java.lang.invoke;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.invoke.MethodHandles class java.lang.invoke.MethodHandles},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.lang.invoke.MethodHandlesTests}.
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
 * @see org.j8unit.repository.java.lang.invoke.MethodHandlesTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.invoke.MethodHandles
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MethodHandlesClassTests<SUT extends java.lang.invoke.MethodHandles>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.lang.invoke.MethodHandles.Lookup class
     * java.lang.invoke.MethodHandles$Lookup}, containing all class relevant test methods (at least the test methods of
     * accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
     * containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.lang.invoke.MethodHandlesTests.LookupTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @see org.j8unit.repository.java.lang.invoke.MethodHandlesTests.LookupTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.lang.invoke.MethodHandles.Lookup
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LookupClassTests<SUT extends java.lang.invoke.MethodHandles.Lookup>
    extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.lang.invoke.MethodHandles.Lookup#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.lang.invoke.MethodHandles.Lookup.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#arrayElementGetter(java.lang.Class) public static
     * java.lang.invoke.MethodHandle java.lang.invoke.MethodHandles.arrayElementGetter(java.lang.Class) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#arrayElementGetter(java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_arrayElementGetter_Class()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#arrayElementSetter(java.lang.Class) public static
     * java.lang.invoke.MethodHandle java.lang.invoke.MethodHandles.arrayElementSetter(java.lang.Class) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#arrayElementSetter(java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_arrayElementSetter_Class()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#catchException(java.lang.invoke.MethodHandle, java.lang.Class, java.lang.invoke.MethodHandle)
     * public static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.catchException(java.lang.invoke.MethodHandle,java.lang.Class,java.lang.invoke.MethodHandle)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#catchException(java.lang.invoke.MethodHandle, java.lang.Class,
     *             java.lang.invoke.MethodHandle)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_catchException_MethodHandle_Class_MethodHandle()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#collectArguments(java.lang.invoke.MethodHandle, int, java.lang.invoke.MethodHandle)
     * public static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.collectArguments(java.lang.invoke.MethodHandle,int,java.lang.invoke.MethodHandle)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#collectArguments(java.lang.invoke.MethodHandle, int,
     *             java.lang.invoke.MethodHandle)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_collectArguments_MethodHandle_int_MethodHandle()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#constant(java.lang.Class, java.lang.Object) public static
     * java.lang.invoke.MethodHandle java.lang.invoke.MethodHandles.constant(java.lang.Class,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#constant(java.lang.Class, java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_constant_Class_Object()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#dropArguments(java.lang.invoke.MethodHandle, int, java.lang.Class...)
     * public static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.dropArguments(java.lang.invoke.MethodHandle,int,java.lang.Class...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#dropArguments(java.lang.invoke.MethodHandle, int, java.lang.Class...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dropArguments_MethodHandle_int_ClassArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#dropArguments(java.lang.invoke.MethodHandle, int, java.util.List) public
     * static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.dropArguments(java.lang.invoke.MethodHandle,int,java.util.List)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#dropArguments(java.lang.invoke.MethodHandle, int, java.util.List)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dropArguments_MethodHandle_int_List()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#exactInvoker(java.lang.invoke.MethodType) public static
     * java.lang.invoke.MethodHandle java.lang.invoke.MethodHandles.exactInvoker(java.lang.invoke.MethodType)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#exactInvoker(java.lang.invoke.MethodType)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exactInvoker_MethodType()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#explicitCastArguments(java.lang.invoke.MethodHandle, java.lang.invoke.MethodType)
     * public static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.explicitCastArguments(java.lang.invoke.MethodHandle,java.lang.invoke.MethodType)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#explicitCastArguments(java.lang.invoke.MethodHandle,
     *             java.lang.invoke.MethodType)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_explicitCastArguments_MethodHandle_MethodType()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#filterArguments(java.lang.invoke.MethodHandle, int, java.lang.invoke.MethodHandle...)
     * public static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.filterArguments(java.lang.invoke.MethodHandle,int,java.lang.invoke.MethodHandle...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#filterArguments(java.lang.invoke.MethodHandle, int,
     *             java.lang.invoke.MethodHandle...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_filterArguments_MethodHandle_int_MethodHandleArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#filterReturnValue(java.lang.invoke.MethodHandle, java.lang.invoke.MethodHandle)
     * public static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.filterReturnValue(java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#filterReturnValue(java.lang.invoke.MethodHandle,
     *             java.lang.invoke.MethodHandle)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_filterReturnValue_MethodHandle_MethodHandle()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#foldArguments(java.lang.invoke.MethodHandle, java.lang.invoke.MethodHandle)
     * public static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.foldArguments(java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#foldArguments(java.lang.invoke.MethodHandle,
     *             java.lang.invoke.MethodHandle)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_foldArguments_MethodHandle_MethodHandle()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#guardWithTest(java.lang.invoke.MethodHandle, java.lang.invoke.MethodHandle, java.lang.invoke.MethodHandle)
     * public static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.guardWithTest(java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle,java.lang.invoke.MethodHandle)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#guardWithTest(java.lang.invoke.MethodHandle,
     *             java.lang.invoke.MethodHandle, java.lang.invoke.MethodHandle)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_guardWithTest_MethodHandle_MethodHandle_MethodHandle()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#identity(java.lang.Class) public static
     * java.lang.invoke.MethodHandle java.lang.invoke.MethodHandles.identity(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#identity(java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_identity_Class()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#insertArguments(java.lang.invoke.MethodHandle, int, java.lang.Object...)
     * public static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.insertArguments(java.lang.invoke.MethodHandle,int,java.lang.Object...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#insertArguments(java.lang.invoke.MethodHandle, int,
     *             java.lang.Object...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_insertArguments_MethodHandle_int_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#invoker(java.lang.invoke.MethodType) public static
     * java.lang.invoke.MethodHandle java.lang.invoke.MethodHandles.invoker(java.lang.invoke.MethodType)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#invoker(java.lang.invoke.MethodType)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoker_MethodType()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#lookup() public static
     * java.lang.invoke.MethodHandles$Lookup java.lang.invoke.MethodHandles.lookup()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#lookup()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookup()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.MethodHandles#permuteArguments(java.lang.invoke.MethodHandle, java.lang.invoke.MethodType, int...)
     * public static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.permuteArguments(java.lang.invoke.MethodHandle,java.lang.invoke.MethodType,int...)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#permuteArguments(java.lang.invoke.MethodHandle,
     *             java.lang.invoke.MethodType, int...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_permuteArguments_MethodHandle_MethodType_intArray()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#publicLookup() public static
     * java.lang.invoke.MethodHandles$Lookup java.lang.invoke.MethodHandles.publicLookup()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#publicLookup()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_publicLookup()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#reflectAs(java.lang.Class, java.lang.invoke.MethodHandle)
     * public static java.lang.reflect.Member
     * java.lang.invoke.MethodHandles.reflectAs(java.lang.Class,java.lang.invoke.MethodHandle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#reflectAs(java.lang.Class, java.lang.invoke.MethodHandle)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reflectAs_Class_MethodHandle()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#spreadInvoker(java.lang.invoke.MethodType, int) public
     * static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.spreadInvoker(java.lang.invoke.MethodType,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#spreadInvoker(java.lang.invoke.MethodType, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spreadInvoker_MethodType_int()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.invoke.MethodHandles#throwException(java.lang.Class, java.lang.Class) public
     * static java.lang.invoke.MethodHandle
     * java.lang.invoke.MethodHandles.throwException(java.lang.Class,java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#throwException(java.lang.Class, java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_throwException_Class_Class()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.lang.invoke.MethodHandles#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.invoke.MethodHandles.class.isAssignableFrom(sut));
    }

}
