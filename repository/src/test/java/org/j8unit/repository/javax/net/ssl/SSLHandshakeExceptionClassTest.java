package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLHandshakeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLHandshakeExceptionClassTest
implements org.j8unit.repository.javax.net.ssl.SSLHandshakeExceptionClassTests<SSLHandshakeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLHandshakeException]

    @Override
    public Class<SSLHandshakeException> createNewSUT() {
        return SSLHandshakeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.net.ssl.SSLHandshakeException#SSLHandshakeException(String) public
     * javax.net.ssl.SSLHandshakeException(java.lang.String)}.
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
    public void create_SSLHandshakeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SSLHandshakeException sut = null; // = new SSLHandshakeException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLHandshakeException]

}
