package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.InternalFrameFocusTraversalPolicy class
 * javax.swing.InternalFrameFocusTraversalPolicy}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.InternalFrameFocusTraversalPolicyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface InternalFrameFocusTraversalPolicyTests<SUT extends javax.swing.InternalFrameFocusTraversalPolicy>
extends org.j8unit.repository.java.awt.FocusTraversalPolicyTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.InternalFrameFocusTraversalPolicy#getInitialComponent(javax.swing.JInternalFrame) public
     * java.awt.Component javax.swing.InternalFrameFocusTraversalPolicy.getInitialComponent(javax.swing.JInternalFrame)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInitialComponent_JInternalFrame()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
