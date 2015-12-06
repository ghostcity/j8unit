package org.j8unit.repository.java.awt;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.ActiveEvent interface java.awt.ActiveEvent}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.ActiveEventClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActiveEventTests<SUT extends java.awt.ActiveEvent>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.ActiveEvent#dispatch() public abstract void java.awt.ActiveEvent.dispatch()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispatch()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}