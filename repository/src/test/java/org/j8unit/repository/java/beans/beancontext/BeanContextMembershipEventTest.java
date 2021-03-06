package org.j8unit.repository.java.beans.beancontext;

import java.beans.beancontext.BeanContextMembershipEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BeanContextMembershipEvent} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.beans.beancontext.BeanContextMembershipEventTests}).
 */
@RunWith(J8Unit4.class)
public class BeanContextMembershipEventTest
implements BeanContextMembershipEventTests<BeanContextMembershipEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.beancontext.BeanContextMembershipEvent]

    @Override
    public BeanContextMembershipEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.beancontext.BeanContextMembershipEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.beancontext.BeanContextMembershipEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.beancontext.BeanContextMembershipEvent]

}
