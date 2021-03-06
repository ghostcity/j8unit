package org.j8unit.repository.java.security;

import static org.junit.Assert.fail;
import java.security.IdentityScope;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IdentityScope} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.IdentityScopeClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class IdentityScopeClassTest
implements IdentityScopeClassTests<IdentityScope> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.IdentityScope]

    @Override
    public Class<IdentityScope> createNewSUT() {
        return IdentityScope.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.IdentityScope#IdentityScope(String, java.security.IdentityScope) public
     * java.security.IdentityScope(java.lang.String,java.security.IdentityScope) throws
     * java.security.KeyManagementException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_IdentityScope_String_IdentityScope()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.IdentityScope#IdentityScope(String) public java.security.IdentityScope(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_IdentityScope_String()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.IdentityScope#getSystemScope() public
     * static java.security.IdentityScope java.security.IdentityScope.getSystemScope()}.
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
    public void test_getSystemScope()
    throws Exception {
        // write some test for {@link java.security.IdentityScope#getSystemScope()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.IdentityScope]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.IdentityScope]

}
