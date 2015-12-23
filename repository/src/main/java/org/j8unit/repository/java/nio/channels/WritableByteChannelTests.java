package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.channels.WritableByteChannel interface
 * java.nio.channels.WritableByteChannel}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.channels.WritableByteChannelTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.channels.WritableByteChannelClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.channels.WritableByteChannel
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WritableByteChannelTests<SUT extends java.nio.channels.WritableByteChannel>
extends org.j8unit.repository.java.nio.channels.ChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.WritableByteChannel#write(java.nio.ByteBuffer) public abstract int
     * java.nio.channels.WritableByteChannel.write(java.nio.ByteBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.channels.WritableByteChannel#write(java.nio.ByteBuffer)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write_ByteBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
