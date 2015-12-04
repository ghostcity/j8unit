package org.j8unit.repository.javax.naming;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.LinkRef class javax.naming.LinkRef}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.LinkRefClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LinkRefTests<SUT extends javax.naming.LinkRef>
extends org.j8unit.repository.javax.naming.ReferenceTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.LinkRef#getLinkName() public java.lang.String
     * javax.naming.LinkRef.getLinkName() throws javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLinkName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
