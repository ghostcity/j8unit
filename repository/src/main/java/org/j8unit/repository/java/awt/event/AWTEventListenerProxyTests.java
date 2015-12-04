package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.AWTEventListenerProxy class java.awt.event.AWTEventListenerProxy}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.event.AWTEventListenerProxyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AWTEventListenerProxyTests<SUT extends java.awt.event.AWTEventListenerProxy>
extends org.j8unit.repository.java.awt.event.AWTEventListenerTests<SUT>,
org.j8unit.repository.java.util.EventListenerProxyTests<SUT, java.awt.event.AWTEventListener> {

    /**
     * <p>
     * Test method for {@link java.awt.event.AWTEventListenerProxy#eventDispatched(java.awt.AWTEvent) public void
     * java.awt.event.AWTEventListenerProxy.eventDispatched(java.awt.AWTEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_eventDispatched_AWTEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.AWTEventListenerProxy#getEventMask() public long
     * java.awt.event.AWTEventListenerProxy.getEventMask()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEventMask()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
