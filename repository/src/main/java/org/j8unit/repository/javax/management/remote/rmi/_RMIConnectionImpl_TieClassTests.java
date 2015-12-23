package org.j8unit.repository.javax.management.remote.rmi;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.remote.rmi._RMIConnectionImpl_Tie class
 * javax.management.remote.rmi._RMIConnectionImpl_Tie}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.management.remote.rmi._RMIConnectionImpl_TieTests}.
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
 * @see org.j8unit.repository.javax.management.remote.rmi._RMIConnectionImpl_TieTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.remote.rmi._RMIConnectionImpl_Tie
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface _RMIConnectionImpl_TieClassTests<SUT extends javax.management.remote.rmi._RMIConnectionImpl_Tie>
extends org.j8unit.repository.javax.rmi.CORBA.TieClassTests<SUT>, org.j8unit.repository.org.omg.CORBA_2_3.portable.ObjectImplClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi._RMIConnectionImpl_Tie#_RMIConnectionImpl_Tie() public
     * javax.management.remote.rmi._RMIConnectionImpl_Tie()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.remote.rmi._RMIConnectionImpl_Tie#_RMIConnectionImpl_Tie()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create__RMIConnectionImpl_Tie()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.management.remote.rmi._RMIConnectionImpl_Tie sut = null; // = new _RMIConnectionImpl_Tie();
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.management.remote.rmi._RMIConnectionImpl_Tie#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.remote.rmi._RMIConnectionImpl_Tie.class.isAssignableFrom(sut));
    }

}
