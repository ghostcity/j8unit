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
 * Test class for {@link javax.swing.event.TreeExpansionListener interface javax.swing.event.TreeExpansionListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.TreeExpansionListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TreeExpansionListenerTests<SUT extends javax.swing.event.TreeExpansionListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.event.TreeExpansionListener#treeCollapsed(javax.swing.event.TreeExpansionEvent) public abstract void javax.swing.event.TreeExpansionListener.treeCollapsed(javax.swing.event.TreeExpansionEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_treeCollapsed_TreeExpansionEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.TreeExpansionListener#treeExpanded(javax.swing.event.TreeExpansionEvent) public abstract void javax.swing.event.TreeExpansionListener.treeExpanded(javax.swing.event.TreeExpansionEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_treeExpanded_TreeExpansionEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
