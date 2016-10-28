package org.j8unit.repository.java.beans;

import java.beans.PropertyChangeListenerProxy;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyChangeListenerProxyClassTest
implements org.j8unit.repository.java.beans.PropertyChangeListenerProxyClassTests<PropertyChangeListenerProxy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.PropertyChangeListenerProxy]

    @Override
    public Class<PropertyChangeListenerProxy> createNewSUT() {
        return PropertyChangeListenerProxy.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.PropertyChangeListenerProxy#PropertyChangeListenerProxy(String, java.beans.PropertyChangeListener)
     * public java.beans.PropertyChangeListenerProxy(java.lang.String,java.beans.PropertyChangeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_PropertyChangeListenerProxy_String_PropertyChangeListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PropertyChangeListenerProxy sut = null; // = new PropertyChangeListenerProxy(String,
                                                      // java.beans.PropertyChangeListener);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.PropertyChangeListenerProxy]

}
