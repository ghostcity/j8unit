package org.j8unit.repository.java.nio.channels;

import java.nio.channels.Pipe;
import java.nio.channels.Pipe.SinkChannel;
import java.nio.channels.Pipe.SourceChannel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PipeClassTest
implements org.j8unit.repository.java.nio.channels.PipeClassTests<Pipe> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.Pipe]

    @Override
    public Class<Pipe> createNewSUT() {
        return Pipe.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.channels.Pipe#open() public static
     * java.nio.channels.Pipe java.nio.channels.Pipe.open() throws java.io.IOException}.
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
    public void test_open()
    throws Exception {
        // write some test for {@link java.nio.channels.Pipe#open()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.Pipe]

    @RunWith(J8Unit4.class)
    public static class SourceChannelClassTest
    implements org.j8unit.repository.java.nio.channels.PipeClassTests.SourceChannelClassTests<SourceChannel> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.Pipe$SourceChannel]

        @Override
        public Class<SourceChannel> createNewSUT() {
            return SourceChannel.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.Pipe$SourceChannel]

    }

    @RunWith(J8Unit4.class)
    public static class SinkChannelClassTest
    implements org.j8unit.repository.java.nio.channels.PipeClassTests.SinkChannelClassTests<SinkChannel> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.channels.Pipe$SinkChannel]

        @Override
        public Class<SinkChannel> createNewSUT() {
            return SinkChannel.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.channels.Pipe$SinkChannel]

    }

}
