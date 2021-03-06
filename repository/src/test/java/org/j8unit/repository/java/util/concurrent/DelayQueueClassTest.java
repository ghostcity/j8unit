package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.DelayQueue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DelayQueue} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.concurrent.DelayQueueClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DelayQueueClassTest
implements DelayQueueClassTests<DelayQueue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.DelayQueue]

    @Override
    public Class<DelayQueue> createNewSUT() {
        return DelayQueue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.concurrent.DelayQueue#DelayQueue()
     * public java.util.concurrent.DelayQueue()}.
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
    public void create_DelayQueue()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DelayQueue sut = new DelayQueue();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.DelayQueue#DelayQueue(java.util.Collection) public
     * java.util.concurrent.DelayQueue(java.util.Collection<? extends E>)}.
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
    public void create_DelayQueue_Collection()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DelayQueue sut = null; // = new DelayQueue(java.util.Collection);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.DelayQueue]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.DelayQueue]

}
