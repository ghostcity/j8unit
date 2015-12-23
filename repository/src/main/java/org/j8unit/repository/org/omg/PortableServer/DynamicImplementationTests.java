package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableServer.DynamicImplementation class
 * org.omg.PortableServer.DynamicImplementation}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.org.omg.PortableServer.DynamicImplementationTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableServer.DynamicImplementationClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableServer.DynamicImplementation
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DynamicImplementationTests<SUT extends org.omg.PortableServer.DynamicImplementation>
extends org.j8unit.repository.org.omg.PortableServer.ServantTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.DynamicImplementation#invoke(org.omg.CORBA.ServerRequest) public
     * abstract void org.omg.PortableServer.DynamicImplementation.invoke(org.omg.CORBA.ServerRequest)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.PortableServer.DynamicImplementation#invoke(org.omg.CORBA.ServerRequest)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_ServerRequest()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
