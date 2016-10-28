package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.AudioInputStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioInputStreamClassTest
implements org.j8unit.repository.javax.sound.sampled.AudioInputStreamClassTests<AudioInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.AudioInputStream]

    @Override
    public Class<AudioInputStream> createNewSUT() {
        return AudioInputStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.sampled.AudioInputStream#AudioInputStream(java.io.InputStream, javax.sound.sampled.AudioFormat, long)
     * public javax.sound.sampled.AudioInputStream(java.io.InputStream,javax.sound.sampled.AudioFormat,long)}.
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
    public void create_AudioInputStream_InputStream_AudioFormat_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AudioInputStream sut = null; // = new AudioInputStream(java.io.InputStream,
                                           // javax.sound.sampled.AudioFormat, long);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.sampled.AudioInputStream#AudioInputStream(javax.sound.sampled.TargetDataLine) public
     * javax.sound.sampled.AudioInputStream(javax.sound.sampled.TargetDataLine)}.
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
    public void create_AudioInputStream_TargetDataLine()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AudioInputStream sut = null; // = new AudioInputStream(javax.sound.sampled.TargetDataLine);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.AudioInputStream]

}
