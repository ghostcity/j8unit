package org.j8unit.repository.java.security;

import java.security.UnrecoverableKeyException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnrecoverableKeyException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.UnrecoverableKeyExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class UnrecoverableKeyExceptionClassTest
implements UnrecoverableKeyExceptionClassTests<UnrecoverableKeyException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.UnrecoverableKeyException]

    @Override
    public Class<UnrecoverableKeyException> createNewSUT() {
        return UnrecoverableKeyException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.UnrecoverableKeyException#UnrecoverableKeyException() public
     * java.security.UnrecoverableKeyException()}.
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
    public void create_UnrecoverableKeyException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnrecoverableKeyException sut = new UnrecoverableKeyException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.UnrecoverableKeyException#UnrecoverableKeyException(String) public
     * java.security.UnrecoverableKeyException(java.lang.String)}.
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
    public void create_UnrecoverableKeyException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnrecoverableKeyException sut = null; // = new UnrecoverableKeyException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.UnrecoverableKeyException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.UnrecoverableKeyException]

}
