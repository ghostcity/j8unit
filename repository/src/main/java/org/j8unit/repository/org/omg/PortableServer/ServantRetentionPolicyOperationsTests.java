package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableServer.ServantRetentionPolicyOperations interface
 * org.omg.PortableServer.ServantRetentionPolicyOperations}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
 * class relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableServer.ServantRetentionPolicyOperationsTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableServer.ServantRetentionPolicyOperationsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableServer.ServantRetentionPolicyOperations
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantRetentionPolicyOperationsTests<SUT extends org.omg.PortableServer.ServantRetentionPolicyOperations>
extends org.j8unit.repository.org.omg.CORBA.PolicyOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.ServantRetentionPolicyOperations#value() public abstract
     * org.omg.PortableServer.ServantRetentionPolicyValue
     * org.omg.PortableServer.ServantRetentionPolicyOperations.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableServer.ServantRetentionPolicyOperations#value()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
