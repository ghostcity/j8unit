package org.j8unit.repository.java.awt.geom;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.geom.Line2D class java.awt.geom.Line2D}, containing all class relevant test methods
 * (at least the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test
 * class containing the instance relevant test methods is {@link org.j8unit.repository.java.awt.geom.Line2DTests}.
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
 * @see org.j8unit.repository.java.awt.geom.Line2DTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface Line2DClassTests<SUT extends Class<? extends java.awt.geom.Line2D>>
extends org.j8unit.repository.java.awt.ShapeClassTests<SUT>, org.j8unit.repository.java.lang.CloneableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link java.awt.geom.Line2D$Double class java.awt.geom.Line2D$Double}, containing all class
     * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
     * methods). The counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.geom.Line2DTests.DoubleTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.awt.geom.Line2DTests.DoubleTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DoubleClassTests<SUT extends Class<? extends java.awt.geom.Line2D.Double>>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.awt.geom.Line2DClassTests<SUT> {

        /**
         * Test method for {@link java.awt.geom.Line2D.Double#Double() public java.awt.geom.Line2D$Double()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Line2D.Double sut = null; // = new Double();
        }

        /**
         * Test method for {@link java.awt.geom.Line2D.Double#Double(double,double,double,double) public
         * java.awt.geom.Line2D$Double(double,double,double,double)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_double_double_double_double()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Line2D.Double sut = null; // = new Double(double,double,double,double);
        }

        /**
         * Test method for {@link java.awt.geom.Line2D.Double#Double(java.awt.geom.Point2D,java.awt.geom.Point2D) public
         * java.awt.geom.Line2D$Double(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_Point2D_Point2D()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Line2D.Double sut = null; // = new Double(java.awt.geom.Point2D,java.awt.geom.Point2D);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.geom.Line2D.Double> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.geom.Line2D.Double.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test class for {@link java.awt.geom.Line2D$Float class java.awt.geom.Line2D$Float}, containing all class relevant
     * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
     * counterpart test class containing the instance relevant test methods is
     * {@link org.j8unit.repository.java.awt.geom.Line2DTests.FloatTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.awt.geom.Line2DTests.FloatTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FloatClassTests<SUT extends Class<? extends java.awt.geom.Line2D.Float>>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.awt.geom.Line2DClassTests<SUT> {

        /**
         * Test method for {@link java.awt.geom.Line2D.Float#Float() public java.awt.geom.Line2D$Float()}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Line2D.Float sut = null; // = new Float();
        }

        /**
         * Test method for {@link java.awt.geom.Line2D.Float#Float(float,float,float,float) public
         * java.awt.geom.Line2D$Float(float,float,float,float)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_float_float_float_float()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Line2D.Float sut = null; // = new Float(float,float,float,float);
        }

        /**
         * Test method for {@link java.awt.geom.Line2D.Float#Float(java.awt.geom.Point2D,java.awt.geom.Point2D) public
         * java.awt.geom.Line2D$Float(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_Point2D_Point2D()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Line2D.Float sut = null; // = new Float(java.awt.geom.Point2D,java.awt.geom.Point2D);
        }

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends java.awt.geom.Line2D.Float> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.geom.Line2D.Float.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.geom.Line2D#linesIntersect(double,double,double,double,double,double,double,double) public static
     * boolean java.awt.geom.Line2D.linesIntersect(double,double,double,double,double,double,double,double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_linesIntersect_double_double_double_double_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Line2D#ptLineDist(double,double,double,double,double,double) public static
     * double java.awt.geom.Line2D.ptLineDist(double,double,double,double,double,double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ptLineDist_double_double_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Line2D#ptLineDistSq(double,double,double,double,double,double) public static
     * double java.awt.geom.Line2D.ptLineDistSq(double,double,double,double,double,double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ptLineDistSq_double_double_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Line2D#ptSegDist(double,double,double,double,double,double) public static
     * double java.awt.geom.Line2D.ptSegDist(double,double,double,double,double,double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ptSegDist_double_double_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Line2D#ptSegDistSq(double,double,double,double,double,double) public static
     * double java.awt.geom.Line2D.ptSegDistSq(double,double,double,double,double,double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ptSegDistSq_double_double_double_double_double_double()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.geom.Line2D#relativeCCW(double,double,double,double,double,double) public static
     * int java.awt.geom.Line2D.relativeCCW(double,double,double,double,double,double)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_relativeCCW_double_double_double_double_double_double()
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
        final Class<? extends java.awt.geom.Line2D> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.geom.Line2D.class.isAssignableFrom(sut));
    }

}