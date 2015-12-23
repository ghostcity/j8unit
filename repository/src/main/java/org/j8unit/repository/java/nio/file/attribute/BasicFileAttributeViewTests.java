package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.attribute.BasicFileAttributeView interface
 * java.nio.file.attribute.BasicFileAttributeView}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.nio.file.attribute.BasicFileAttributeViewTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.attribute.BasicFileAttributeViewClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.attribute.BasicFileAttributeView
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicFileAttributeViewTests<SUT extends java.nio.file.attribute.BasicFileAttributeView>
extends org.j8unit.repository.java.nio.file.attribute.FileAttributeViewTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.BasicFileAttributeView#name() public abstract java.lang.String
     * java.nio.file.attribute.BasicFileAttributeView.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.attribute.BasicFileAttributeView#name()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.BasicFileAttributeView#readAttributes() public abstract
     * java.nio.file.attribute.BasicFileAttributes java.nio.file.attribute.BasicFileAttributeView.readAttributes()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.attribute.BasicFileAttributeView#readAttributes()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.attribute.BasicFileAttributeView#setTimes(java.nio.file.attribute.FileTime, java.nio.file.attribute.FileTime, java.nio.file.attribute.FileTime)
     * public abstract void
     * java.nio.file.attribute.BasicFileAttributeView.setTimes(java.nio.file.attribute.FileTime,java.nio.file.attribute.FileTime,java.nio.file.attribute.FileTime)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.attribute.BasicFileAttributeView#setTimes(java.nio.file.attribute.FileTime,
     *             java.nio.file.attribute.FileTime, java.nio.file.attribute.FileTime)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTimes_FileTime_FileTime_FileTime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
