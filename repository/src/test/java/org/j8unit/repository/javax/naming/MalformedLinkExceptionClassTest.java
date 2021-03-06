package org.j8unit.repository.javax.naming;

import javax.naming.MalformedLinkException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MalformedLinkException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.naming.MalformedLinkExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class MalformedLinkExceptionClassTest
implements MalformedLinkExceptionClassTests<MalformedLinkException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.MalformedLinkException]

    @Override
    public Class<MalformedLinkException> createNewSUT() {
        return MalformedLinkException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.MalformedLinkException#MalformedLinkException(String) public
     * javax.naming.MalformedLinkException(java.lang.String)}.
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
    public void create_MalformedLinkException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MalformedLinkException sut = null; // = new MalformedLinkException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.MalformedLinkException#MalformedLinkException() public
     * javax.naming.MalformedLinkException()}.
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
    public void create_MalformedLinkException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MalformedLinkException sut = new MalformedLinkException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.MalformedLinkException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.MalformedLinkException]

}
