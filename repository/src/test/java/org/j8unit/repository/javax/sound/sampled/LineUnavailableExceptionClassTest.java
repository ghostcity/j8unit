package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.LineUnavailableException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LineUnavailableExceptionClassTest
implements org.j8unit.repository.javax.sound.sampled.LineUnavailableExceptionClassTests<LineUnavailableException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.LineUnavailableException]

    @Override
    public Class<LineUnavailableException> createNewSUT() {
        return LineUnavailableException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.sampled.LineUnavailableException#LineUnavailableException() public
     * javax.sound.sampled.LineUnavailableException()}.
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
    public void create_LineUnavailableException()
    throws Exception {
        // create new instance
        final LineUnavailableException sut = new LineUnavailableException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sound.sampled.LineUnavailableException#LineUnavailableException(String) public
     * javax.sound.sampled.LineUnavailableException(java.lang.String)}.
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
    public void create_LineUnavailableException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LineUnavailableException sut = null; // = new LineUnavailableException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.LineUnavailableException]

}
