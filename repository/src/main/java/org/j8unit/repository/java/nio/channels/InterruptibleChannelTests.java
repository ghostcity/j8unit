package org.j8unit.repository.java.nio.channels;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.channels.InterruptibleChannel interface java.nio.channels.InterruptibleChannel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.channels.InterruptibleChannelClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InterruptibleChannelTests<SUT extends java.nio.channels.InterruptibleChannel>
extends org.j8unit.repository.java.nio.channels.ChannelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.channels.InterruptibleChannel#close() public abstract void
     * java.nio.channels.InterruptibleChannel.close() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}