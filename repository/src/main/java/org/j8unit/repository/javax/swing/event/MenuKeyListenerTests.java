package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.MenuKeyListener interface javax.swing.event.MenuKeyListener}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.MenuKeyListenerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MenuKeyListenerTests<SUT extends javax.swing.event.MenuKeyListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.MenuKeyListener#menuKeyPressed(javax.swing.event.MenuKeyEvent) public
     * abstract void javax.swing.event.MenuKeyListener.menuKeyPressed(javax.swing.event.MenuKeyEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_menuKeyPressed_MenuKeyEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.MenuKeyListener#menuKeyReleased(javax.swing.event.MenuKeyEvent) public
     * abstract void javax.swing.event.MenuKeyListener.menuKeyReleased(javax.swing.event.MenuKeyEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_menuKeyReleased_MenuKeyEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.MenuKeyListener#menuKeyTyped(javax.swing.event.MenuKeyEvent) public
     * abstract void javax.swing.event.MenuKeyListener.menuKeyTyped(javax.swing.event.MenuKeyEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_menuKeyTyped_MenuKeyEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}