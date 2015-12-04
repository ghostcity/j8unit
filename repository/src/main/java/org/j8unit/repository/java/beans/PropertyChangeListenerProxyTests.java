package org.j8unit.repository.java.beans;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.beans.PropertyChangeListenerProxy class java.beans.PropertyChangeListenerProxy},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.PropertyChangeListenerProxyClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PropertyChangeListenerProxyTests<SUT extends java.beans.PropertyChangeListenerProxy>
extends org.j8unit.repository.java.beans.PropertyChangeListenerTests<SUT>,
        org.j8unit.repository.java.util.EventListenerProxyTests<SUT,java.beans.PropertyChangeListener>
{

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeListenerProxy#propertyChange(java.beans.PropertyChangeEvent) public void java.beans.PropertyChangeListenerProxy.propertyChange(java.beans.PropertyChangeEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_propertyChange_PropertyChangeEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.beans.PropertyChangeListenerProxy#getPropertyName() public java.lang.String java.beans.PropertyChangeListenerProxy.getPropertyName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
