package org.j8unit.repository.javax.naming.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.event.ObjectChangeListener interface javax.naming.event.ObjectChangeListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.event.ObjectChangeListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ObjectChangeListenerTests<SUT extends javax.naming.event.ObjectChangeListener>
extends org.j8unit.repository.javax.naming.event.NamingListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.event.ObjectChangeListener#objectChanged(javax.naming.event.NamingEvent)
     * public abstract void javax.naming.event.ObjectChangeListener.objectChanged(javax.naming.event.NamingEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_objectChanged_NamingEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
