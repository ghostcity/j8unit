package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.management.GarbageCollectorMXBean interface
 * java.lang.management.GarbageCollectorMXBean}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.management.GarbageCollectorMXBeanClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GarbageCollectorMXBeanTests<SUT extends java.lang.management.GarbageCollectorMXBean>
extends org.j8unit.repository.java.lang.management.MemoryManagerMXBeanTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.GarbageCollectorMXBean#getCollectionCount() public abstract long
     * java.lang.management.GarbageCollectorMXBean.getCollectionCount()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCollectionCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.GarbageCollectorMXBean#getCollectionTime() public abstract long
     * java.lang.management.GarbageCollectorMXBean.getCollectionTime()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCollectionTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}