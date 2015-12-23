package org.j8unit.repository.java.beans.beancontext;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.beancontext.BeanContextMembershipEvent class
 * java.beans.beancontext.BeanContextMembershipEvent}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart J8Unit test interface
 * containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextMembershipEventTests}.
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
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextMembershipEventTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.beancontext.BeanContextMembershipEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BeanContextMembershipEventClassTests<SUT extends java.beans.beancontext.BeanContextMembershipEvent>
extends org.j8unit.repository.java.beans.beancontext.BeanContextEventClassTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextMembershipEvent#BeanContextMembershipEvent(java.beans.beancontext.BeanContext, java.util.Collection)
     * public
     * java.beans.beancontext.BeanContextMembershipEvent(java.beans.beancontext.BeanContext,java.util.Collection)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextMembershipEvent#BeanContextMembershipEvent(java.beans.beancontext.
     *             BeanContext, java.util.Collection)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BeanContextMembershipEvent_BeanContext_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.beancontext.BeanContextMembershipEvent sut = null; // = new
                                                                            // BeanContextMembershipEvent(java.beans.beancontext.BeanContext,
                                                                            // java.util.Collection);
    }

    /**
     * <p>
     * Test method for
     * {@link java.beans.beancontext.BeanContextMembershipEvent#BeanContextMembershipEvent(java.beans.beancontext.BeanContext, java.lang.Object[])
     * public java.beans.beancontext.BeanContextMembershipEvent(java.beans.beancontext.BeanContext,java.lang.Object[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.beans.beancontext.BeanContextMembershipEvent#BeanContextMembershipEvent(java.beans.beancontext.
     *             BeanContext, java.lang.Object[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_BeanContextMembershipEvent_BeanContext_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.beans.beancontext.BeanContextMembershipEvent sut = null; // = new
                                                                            // BeanContextMembershipEvent(java.beans.beancontext.BeanContext,
                                                                            // java.lang.Object[]);
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim java.beans.beancontext.BeanContextMembershipEvent#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.beans.beancontext.BeanContextMembershipEvent.class.isAssignableFrom(sut));
    }

}
