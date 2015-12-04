package org.j8unit.repository.java.awt.image;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.image.DataBufferDouble class java.awt.image.DataBufferDouble},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.awt.image.DataBufferDoubleTests}.
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
 * @see org.j8unit.repository.java.awt.image.DataBufferDoubleTests
 */
@Category(J8UnitRepository.class)
public abstract interface DataBufferDoubleClassTests<SUT extends Class<? extends java.awt.image.DataBufferDouble>>
extends org.j8unit.repository.java.awt.image.DataBufferClassTests<SUT>
{

    /**
     * Test method for {@link java.awt.image.DataBufferDouble#DataBufferDouble(double[][],int,int[]) public java.awt.image.DataBufferDouble(double[][],int,int[])}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferDouble_doubleArrayArray_int_intArray() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.image.DataBufferDouble sut = null; // = new DataBufferDouble(double[][],int,int[]);
    }

    /**
     * Test method for {@link java.awt.image.DataBufferDouble#DataBufferDouble(double[][],int) public java.awt.image.DataBufferDouble(double[][],int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferDouble_doubleArrayArray_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.image.DataBufferDouble sut = null; // = new DataBufferDouble(double[][],int);
    }

    /**
     * Test method for {@link java.awt.image.DataBufferDouble#DataBufferDouble(double[],int,int) public java.awt.image.DataBufferDouble(double[],int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferDouble_doubleArray_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.image.DataBufferDouble sut = null; // = new DataBufferDouble(double[],int,int);
    }

    /**
     * Test method for {@link java.awt.image.DataBufferDouble#DataBufferDouble(int) public java.awt.image.DataBufferDouble(int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferDouble_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.image.DataBufferDouble sut = null; // = new DataBufferDouble(int);
    }

    /**
     * Test method for {@link java.awt.image.DataBufferDouble#DataBufferDouble(int,int) public java.awt.image.DataBufferDouble(int,int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferDouble_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.image.DataBufferDouble sut = null; // = new DataBufferDouble(int,int);
    }

    /**
     * Test method for {@link java.awt.image.DataBufferDouble#DataBufferDouble(double[],int) public java.awt.image.DataBufferDouble(double[],int)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DataBufferDouble_doubleArray_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        java.awt.image.DataBufferDouble sut = null; // = new DataBufferDouble(double[],int);
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.awt.image.DataBufferDouble> sut = createNewSUT();
        // assert assignability
        assertTrue(java.awt.image.DataBufferDouble.class.isAssignableFrom(sut));
    }

}
