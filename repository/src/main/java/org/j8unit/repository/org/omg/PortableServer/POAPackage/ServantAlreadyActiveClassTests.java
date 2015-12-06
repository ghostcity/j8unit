package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.POAPackage.ServantAlreadyActive class
 * org.omg.PortableServer.POAPackage.ServantAlreadyActive}, containing all class relevant test methods (at least the
 * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableServer.POAPackage.ServantAlreadyActiveTests}.
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
 * @see org.j8unit.repository.org.omg.PortableServer.POAPackage.ServantAlreadyActiveTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantAlreadyActiveClassTests<SUT extends Class<? extends org.omg.PortableServer.POAPackage.ServantAlreadyActive>>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionClassTests<SUT> {

    /**
     * Test method for {@link org.omg.PortableServer.POAPackage.ServantAlreadyActive#ServantAlreadyActive() public
     * org.omg.PortableServer.POAPackage.ServantAlreadyActive()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServantAlreadyActive()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.PortableServer.POAPackage.ServantAlreadyActive sut = null; // = new ServantAlreadyActive();
    }

    /**
     * Test method for
     * {@link org.omg.PortableServer.POAPackage.ServantAlreadyActive#ServantAlreadyActive(java.lang.String) public
     * org.omg.PortableServer.POAPackage.ServantAlreadyActive(java.lang.String)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ServantAlreadyActive_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final org.omg.PortableServer.POAPackage.ServantAlreadyActive sut = null; // = new
                                                                                 // ServantAlreadyActive(java.lang.String);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.PortableServer.POAPackage.ServantAlreadyActive> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.PortableServer.POAPackage.ServantAlreadyActive.class.isAssignableFrom(sut));
    }

}