package org.j8unit.repository.javax.security.auth.login;

import javax.security.auth.login.LoginException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LoginException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.auth.login.LoginExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class LoginExceptionClassTest
implements LoginExceptionClassTests<LoginException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.login.LoginException]

    @Override
    public Class<LoginException> createNewSUT() {
        return LoginException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.login.LoginException#LoginException() public
     * javax.security.auth.login.LoginException()}.
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
    public void create_LoginException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LoginException sut = new LoginException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.login.LoginException#LoginException(String) public
     * javax.security.auth.login.LoginException(java.lang.String)}.
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
    public void create_LoginException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LoginException sut = null; // = new LoginException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.login.LoginException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.login.LoginException]

}
