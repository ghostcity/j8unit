package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.file.attribute.UserDefinedFileAttributeView interface
 * java.nio.file.attribute.UserDefinedFileAttributeView}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.attribute.UserDefinedFileAttributeViewClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UserDefinedFileAttributeViewTests<SUT extends java.nio.file.attribute.UserDefinedFileAttributeView>
extends org.j8unit.repository.java.nio.file.attribute.FileAttributeViewTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.UserDefinedFileAttributeView#delete(java.lang.String) public
     * abstract void java.nio.file.attribute.UserDefinedFileAttributeView.delete(java.lang.String) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_delete_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.UserDefinedFileAttributeView#list() public abstract java.util.List
     * java.nio.file.attribute.UserDefinedFileAttributeView.list() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_list()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.UserDefinedFileAttributeView#name() public abstract
     * java.lang.String java.nio.file.attribute.UserDefinedFileAttributeView.name()}.
     * </p>
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
     * Test method for
     * {@link java.nio.file.attribute.UserDefinedFileAttributeView#read(java.lang.String,java.nio.ByteBuffer) public
     * abstract int java.nio.file.attribute.UserDefinedFileAttributeView.read(java.lang.String,java.nio.ByteBuffer)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_String_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.UserDefinedFileAttributeView#size(java.lang.String) public
     * abstract int java.nio.file.attribute.UserDefinedFileAttributeView.size(java.lang.String) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_size_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.attribute.UserDefinedFileAttributeView#write(java.lang.String,java.nio.ByteBuffer) public
     * abstract int java.nio.file.attribute.UserDefinedFileAttributeView.write(java.lang.String,java.nio.ByteBuffer)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_String_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}