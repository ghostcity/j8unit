package org.j8unit.repository.java.util.jar;

import java.util.jar.JarException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarExceptionClassTest
implements org.j8unit.repository.java.util.jar.JarExceptionClassTests<JarException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.jar.JarException]

    @Override
    public Class<JarException> createNewSUT() {
        return JarException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.jar.JarException#JarException()
     * public java.util.jar.JarException()}.
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
    public void create_JarException()
    throws Exception {
        // create new instance
        final JarException sut = new JarException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.jar.JarException#JarException(String)
     * public java.util.jar.JarException(java.lang.String)}.
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
    public void create_JarException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JarException sut = null; // = new JarException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.jar.JarException]

}
