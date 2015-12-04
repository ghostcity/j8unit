package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.ACTIVITY_COMPLETED class org.omg.CORBA.ACTIVITY_COMPLETED}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.ACTIVITY_COMPLETEDTests}.
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
 * @see org.j8unit.repository.org.omg.CORBA.ACTIVITY_COMPLETEDTests
 */
@Category(J8UnitRepository.class)
public abstract interface ACTIVITY_COMPLETEDClassTests<SUT extends Class<? extends org.omg.CORBA.ACTIVITY_COMPLETED>>
extends org.j8unit.repository.org.omg.CORBA.SystemExceptionClassTests<SUT> {

    /**
     * Test method for {@link org.omg.CORBA.ACTIVITY_COMPLETED#ACTIVITY_COMPLETED() public
     * org.omg.CORBA.ACTIVITY_COMPLETED()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ACTIVITY_COMPLETED()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.ACTIVITY_COMPLETED sut = null; // = new ACTIVITY_COMPLETED();
    }

    /**
     * Test method for {@link org.omg.CORBA.ACTIVITY_COMPLETED#ACTIVITY_COMPLETED(int,org.omg.CORBA.CompletionStatus)
     * public org.omg.CORBA.ACTIVITY_COMPLETED(int,org.omg.CORBA.CompletionStatus)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ACTIVITY_COMPLETED_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.ACTIVITY_COMPLETED sut = null; // = new
                                                           // ACTIVITY_COMPLETED(int,org.omg.CORBA.CompletionStatus);
    }

    /**
     * Test method for {@link org.omg.CORBA.ACTIVITY_COMPLETED#ACTIVITY_COMPLETED(java.lang.String) public
     * org.omg.CORBA.ACTIVITY_COMPLETED(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ACTIVITY_COMPLETED_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.ACTIVITY_COMPLETED sut = null; // = new ACTIVITY_COMPLETED(java.lang.String);
    }

    /**
     * Test method for
     * {@link org.omg.CORBA.ACTIVITY_COMPLETED#ACTIVITY_COMPLETED(java.lang.String,int,org.omg.CORBA.CompletionStatus)
     * public org.omg.CORBA.ACTIVITY_COMPLETED(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ACTIVITY_COMPLETED_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.CORBA.ACTIVITY_COMPLETED sut = null; // = new
                                                           // ACTIVITY_COMPLETED(java.lang.String,int,org.omg.CORBA.CompletionStatus);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.CORBA.ACTIVITY_COMPLETED> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.CORBA.ACTIVITY_COMPLETED.class.isAssignableFrom(sut));
    }

}
