package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NoSuchMethodException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.NoSuchMethodExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class NoSuchMethodExceptionClassTest
implements NoSuchMethodExceptionClassTests<NoSuchMethodException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.NoSuchMethodException]

    @Override
    public Class<NoSuchMethodException> createNewSUT() {
        return NoSuchMethodException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NoSuchMethodException#NoSuchMethodException()
     * public java.lang.NoSuchMethodException()}.
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
    public void create_NoSuchMethodException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoSuchMethodException sut = new NoSuchMethodException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NoSuchMethodException#NoSuchMethodException(String) public
     * java.lang.NoSuchMethodException(java.lang.String)}.
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
    public void create_NoSuchMethodException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoSuchMethodException sut = null; // = new NoSuchMethodException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.NoSuchMethodException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.NoSuchMethodException]

}
