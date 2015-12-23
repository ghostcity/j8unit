package org.j8unit.repository.java.awt.geom;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.geom.Arc2D class java.awt.geom.Arc2D}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.awt.geom.Arc2DTests}.
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
 * @see org.j8unit.repository.java.awt.geom.Arc2DTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.geom.Arc2D
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface Arc2DClassTests<SUT extends java.awt.geom.Arc2D>
extends org.j8unit.repository.java.awt.geom.RectangularShapeClassTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.awt.geom.Arc2D.Double class java.awt.geom.Arc2D$Double},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.awt.geom.Arc2DTests.DoubleTests}.
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
     * @see org.j8unit.repository.java.awt.geom.Arc2DTests.DoubleTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.awt.geom.Arc2D.Double
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DoubleClassTests<SUT extends java.awt.geom.Arc2D.Double>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.awt.geom.Arc2DClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.awt.geom.Arc2D.Double#Double() public java.awt.geom.Arc2D$Double()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.Arc2D.Double#Double()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Arc2D.Double sut = null; // = new Double();
        }

        /**
         * <p>
         * Test method for {@link java.awt.geom.Arc2D.Double#Double(double, double, double, double, double, double, int)
         * public java.awt.geom.Arc2D$Double(double,double,double,double,double,double,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.Arc2D.Double#Double(double, double, double, double, double, double, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_double_double_double_double_double_double_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Arc2D.Double sut = null; // = new Double(double, double, double, double, double, double,
                                                         // int);
        }

        /**
         * <p>
         * Test method for {@link java.awt.geom.Arc2D.Double#Double(int) public java.awt.geom.Arc2D$Double(int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.Arc2D.Double#Double(int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Arc2D.Double sut = null; // = new Double(int);
        }

        /**
         * <p>
         * Test method for {@link java.awt.geom.Arc2D.Double#Double(java.awt.geom.Rectangle2D, double, double, int)
         * public java.awt.geom.Arc2D$Double(java.awt.geom.Rectangle2D,double,double,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.Arc2D.Double#Double(java.awt.geom.Rectangle2D, double, double, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Double_Rectangle2D_double_double_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Arc2D.Double sut = null; // = new Double(java.awt.geom.Rectangle2D, double, double,
                                                         // int);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.awt.geom.Arc2D.Double#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.geom.Arc2D.Double.class.isAssignableFrom(sut));
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.awt.geom.Arc2D.Float class java.awt.geom.Arc2D$Float},
     * containing all class relevant test methods (at least the test methods of accessible constructors and of
     * accessible {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test
     * methods is {@link org.j8unit.repository.java.awt.geom.Arc2DTests.FloatTests}.
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
     * @see org.j8unit.repository.java.awt.geom.Arc2DTests.FloatTests
     *
     * @param SUT
     *            the class' type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.awt.geom.Arc2D.Float
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FloatClassTests<SUT extends java.awt.geom.Arc2D.Float>
    extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.awt.geom.Arc2DClassTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.awt.geom.Arc2D.Float#Float() public java.awt.geom.Arc2D$Float()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.Arc2D.Float#Float()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Arc2D.Float sut = null; // = new Float();
        }

        /**
         * <p>
         * Test method for {@link java.awt.geom.Arc2D.Float#Float(float, float, float, float, float, float, int) public
         * java.awt.geom.Arc2D$Float(float,float,float,float,float,float,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.Arc2D.Float#Float(float, float, float, float, float, float, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_float_float_float_float_float_float_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Arc2D.Float sut = null; // = new Float(float, float, float, float, float, float, int);
        }

        /**
         * <p>
         * Test method for {@link java.awt.geom.Arc2D.Float#Float(int) public java.awt.geom.Arc2D$Float(int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.Arc2D.Float#Float(int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Arc2D.Float sut = null; // = new Float(int);
        }

        /**
         * <p>
         * Test method for {@link java.awt.geom.Arc2D.Float#Float(java.awt.geom.Rectangle2D, float, float, int) public
         * java.awt.geom.Arc2D$Float(java.awt.geom.Rectangle2D,float,float,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.awt.geom.Arc2D.Float#Float(java.awt.geom.Rectangle2D, float, float, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void create_Float_Rectangle2D_float_float_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final java.awt.geom.Arc2D.Float sut = null; // = new Float(java.awt.geom.Rectangle2D, float, float, int);
        }

        /**
         * @since 0.9.2
         *
         * @j8unit.aim java.awt.geom.Arc2D.Float#isAssignableFrom(java.lang.Class)
         */
        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<SUT> sut = createNewSUT();
            // assert assignability
            assertTrue(java.awt.geom.Arc2D.Float.class.isAssignableFrom(sut));
        }

    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.awt.geom.Arc2D#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.geom.Arc2D.class.isAssignableFrom(sut));
    }

}
