package org.j8unit.repository.javax.crypto;

import javax.crypto.IllegalBlockSizeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalBlockSizeExceptionClassTest
implements org.j8unit.repository.javax.crypto.IllegalBlockSizeExceptionClassTests<IllegalBlockSizeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.IllegalBlockSizeException]

    @Override
    public Class<IllegalBlockSizeException> createNewSUT() {
        return IllegalBlockSizeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.IllegalBlockSizeException#IllegalBlockSizeException() public
     * javax.crypto.IllegalBlockSizeException()}.
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
    public void create_IllegalBlockSizeException()
    throws Exception {
        // create new instance
        final IllegalBlockSizeException sut = new IllegalBlockSizeException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.crypto.IllegalBlockSizeException#IllegalBlockSizeException(String) public
     * javax.crypto.IllegalBlockSizeException(java.lang.String)}.
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
    public void create_IllegalBlockSizeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalBlockSizeException sut = null; // = new IllegalBlockSizeException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.IllegalBlockSizeException]

}
