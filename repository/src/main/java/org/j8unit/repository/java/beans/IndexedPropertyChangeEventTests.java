package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.beans.IndexedPropertyChangeEvent class java.beans.IndexedPropertyChangeEvent}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.IndexedPropertyChangeEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IndexedPropertyChangeEventTests<SUT extends java.beans.IndexedPropertyChangeEvent>
extends org.j8unit.repository.java.beans.PropertyChangeEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.beans.IndexedPropertyChangeEvent#getIndex() public int
     * java.beans.IndexedPropertyChangeEvent.getIndex()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIndex()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
