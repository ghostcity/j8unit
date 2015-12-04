package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.ImplicitActivationPolicyOperations interface org.omg.PortableServer.ImplicitActivationPolicyOperations},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.ImplicitActivationPolicyOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ImplicitActivationPolicyOperationsTests<SUT extends org.omg.PortableServer.ImplicitActivationPolicyOperations>
extends org.j8unit.repository.org.omg.CORBA.PolicyOperationsTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.ImplicitActivationPolicyOperations#value() public abstract org.omg.PortableServer.ImplicitActivationPolicyValue org.omg.PortableServer.ImplicitActivationPolicyOperations.value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
