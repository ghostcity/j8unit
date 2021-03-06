package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GSSException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.ietf.jgss.GSSExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class GSSExceptionClassTest
implements GSSExceptionClassTests<GSSException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.GSSException]

    @Override
    public Class<GSSException> createNewSUT() {
        return GSSException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.ietf.jgss.GSSException#GSSException(int)
     * public org.ietf.jgss.GSSException(int)}.
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
    public void create_GSSException_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GSSException sut = null; // = new GSSException(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.ietf.jgss.GSSException#GSSException(int, int, String) public
     * org.ietf.jgss.GSSException(int,int,java.lang.String)}.
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
    public void create_GSSException_int_int_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GSSException sut = null; // = new GSSException(int, int, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.ietf.jgss.GSSException]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.GSSException]

}
