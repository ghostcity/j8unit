package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.PolicyErrorHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PolicyErrorHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.PolicyErrorHolderClassTests}).
 */
@RunWith(J8Unit4.class)
public class PolicyErrorHolderClassTest
implements PolicyErrorHolderClassTests<PolicyErrorHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.PolicyErrorHolder]

    @Override
    public Class<PolicyErrorHolder> createNewSUT() {
        return PolicyErrorHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.PolicyErrorHolder#PolicyErrorHolder(org.omg.CORBA.PolicyError) public
     * org.omg.CORBA.PolicyErrorHolder(org.omg.CORBA.PolicyError)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_PolicyErrorHolder_PolicyError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PolicyErrorHolder sut = null; // = new PolicyErrorHolder(org.omg.CORBA.PolicyError);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.PolicyErrorHolder#PolicyErrorHolder() public org.omg.CORBA.PolicyErrorHolder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_PolicyErrorHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PolicyErrorHolder sut = new PolicyErrorHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.PolicyErrorHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.PolicyErrorHolder]

}
