package org.j8unit.repository.java.text;

import java.text.DecimalFormat;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DecimalFormat} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.DecimalFormatClassTests}).
 */
@RunWith(J8Unit4.class)
public class DecimalFormatClassTest
implements DecimalFormatClassTests<DecimalFormat> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.DecimalFormat]

    @Override
    public Class<DecimalFormat> createNewSUT() {
        return DecimalFormat.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.text.DecimalFormat#DecimalFormat(String)
     * public java.text.DecimalFormat(java.lang.String)}.
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
    public void create_DecimalFormat_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DecimalFormat sut = null; // = new DecimalFormat(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.DecimalFormat#DecimalFormat(String, java.text.DecimalFormatSymbols) public
     * java.text.DecimalFormat(java.lang.String,java.text.DecimalFormatSymbols)}.
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
    public void create_DecimalFormat_String_DecimalFormatSymbols()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DecimalFormat sut = null; // = new DecimalFormat(String, java.text.DecimalFormatSymbols);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.text.DecimalFormat#DecimalFormat() public
     * java.text.DecimalFormat()}.
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
    public void create_DecimalFormat()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DecimalFormat sut = new DecimalFormat();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.DecimalFormat]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.DecimalFormat]

}
