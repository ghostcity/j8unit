package org.j8unit.repository.java.util.prefs;

import java.util.prefs.NodeChangeEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NodeChangeEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.prefs.NodeChangeEventClassTests}).
 */
@RunWith(J8Unit4.class)
public class NodeChangeEventClassTest
implements NodeChangeEventClassTests<NodeChangeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.prefs.NodeChangeEvent]

    @Override
    public Class<NodeChangeEvent> createNewSUT() {
        return NodeChangeEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.prefs.NodeChangeEvent#NodeChangeEvent(java.util.prefs.Preferences, java.util.prefs.Preferences)
     * public java.util.prefs.NodeChangeEvent(java.util.prefs.Preferences,java.util.prefs.Preferences)}.
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
    public void create_NodeChangeEvent_Preferences_Preferences()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NodeChangeEvent sut = null; // = new NodeChangeEvent(java.util.prefs.Preferences,
                                          // java.util.prefs.Preferences);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.prefs.NodeChangeEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.prefs.NodeChangeEvent]

}
