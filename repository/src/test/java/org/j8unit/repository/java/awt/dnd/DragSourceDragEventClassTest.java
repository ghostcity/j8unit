package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragSourceDragEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DragSourceDragEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DragSourceDragEventClassTests}).
 */
@RunWith(J8Unit4.class)
public class DragSourceDragEventClassTest
implements DragSourceDragEventClassTests<DragSourceDragEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DragSourceDragEvent]

    @Override
    public Class<DragSourceDragEvent> createNewSUT() {
        return DragSourceDragEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DragSourceDragEvent#DragSourceDragEvent(java.awt.dnd.DragSourceContext, int, int, int, int, int)
     * public java.awt.dnd.DragSourceDragEvent(java.awt.dnd.DragSourceContext,int,int,int,int,int)}.
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
    public void create_DragSourceDragEvent_DragSourceContext_int_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DragSourceDragEvent sut = null; // = new DragSourceDragEvent(java.awt.dnd.DragSourceContext, int, int,
                                              // int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DragSourceDragEvent#DragSourceDragEvent(java.awt.dnd.DragSourceContext, int, int, int) public
     * java.awt.dnd.DragSourceDragEvent(java.awt.dnd.DragSourceContext,int,int,int)}.
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
    public void create_DragSourceDragEvent_DragSourceContext_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DragSourceDragEvent sut = null; // = new DragSourceDragEvent(java.awt.dnd.DragSourceContext, int, int,
                                              // int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DragSourceDragEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DragSourceDragEvent]

}
