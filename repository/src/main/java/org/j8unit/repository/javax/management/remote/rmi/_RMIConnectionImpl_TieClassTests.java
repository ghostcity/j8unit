package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.remote.rmi._RMIConnectionImpl_Tie class javax.management.remote.rmi._RMIConnectionImpl_Tie},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.management.remote.rmi._RMIConnectionImpl_TieTests}.
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
 * @see org.j8unit.repository.javax.management.remote.rmi._RMIConnectionImpl_TieTests
 */
@Category(J8UnitRepository.class)
public abstract interface _RMIConnectionImpl_TieClassTests<SUT extends Class<? extends javax.management.remote.rmi._RMIConnectionImpl_Tie>>
extends org.j8unit.repository.javax.rmi.CORBA.TieClassTests<SUT>,
        org.j8unit.repository.org.omg.CORBA_2_3.portable.ObjectImplClassTests<SUT>
{

    /**
     * Test method for {@link javax.management.remote.rmi._RMIConnectionImpl_Tie#_RMIConnectionImpl_Tie() public javax.management.remote.rmi._RMIConnectionImpl_Tie()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create__RMIConnectionImpl_Tie() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.management.remote.rmi._RMIConnectionImpl_Tie sut = null; // = new _RMIConnectionImpl_Tie();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.management.remote.rmi._RMIConnectionImpl_Tie> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.management.remote.rmi._RMIConnectionImpl_Tie.class.isAssignableFrom(sut));
    }

}
