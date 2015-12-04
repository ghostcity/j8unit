package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.ScatteringByteChannel interface java.nio.channels.ScatteringByteChannel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.ScatteringByteChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ScatteringByteChannelTests<SUT extends java.nio.channels.ScatteringByteChannel>
extends org.j8unit.repository.java.nio.channels.ReadableByteChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.ScatteringByteChannel#read(java.nio.ByteBuffer[]) public abstract long
     * java.nio.channels.ScatteringByteChannel.read(java.nio.ByteBuffer[]) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBufferArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.channels.ScatteringByteChannel#read(java.nio.ByteBuffer[],int,int) public
     * abstract long java.nio.channels.ScatteringByteChannel.read(java.nio.ByteBuffer[],int,int) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBufferArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
