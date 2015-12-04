package org.j8unit.repository.java.nio.channels;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.channels.ReadableByteChannel interface java.nio.channels.ReadableByteChannel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.ReadableByteChannelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ReadableByteChannelTests<SUT extends java.nio.channels.ReadableByteChannel>
extends org.j8unit.repository.java.nio.channels.ChannelTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.channels.ReadableByteChannel#read(java.nio.ByteBuffer) public abstract int java.nio.channels.ReadableByteChannel.read(java.nio.ByteBuffer) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_ByteBuffer() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
