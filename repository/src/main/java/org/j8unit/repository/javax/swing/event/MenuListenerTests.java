package org.j8unit.repository.javax.swing.event;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.event.MenuListener interface javax.swing.event.MenuListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.MenuListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MenuListenerTests<SUT extends javax.swing.event.MenuListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.event.MenuListener#menuCanceled(javax.swing.event.MenuEvent) public abstract void javax.swing.event.MenuListener.menuCanceled(javax.swing.event.MenuEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_menuCanceled_MenuEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.MenuListener#menuDeselected(javax.swing.event.MenuEvent) public abstract void javax.swing.event.MenuListener.menuDeselected(javax.swing.event.MenuEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_menuDeselected_MenuEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.MenuListener#menuSelected(javax.swing.event.MenuEvent) public abstract void javax.swing.event.MenuListener.menuSelected(javax.swing.event.MenuEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_menuSelected_MenuEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
