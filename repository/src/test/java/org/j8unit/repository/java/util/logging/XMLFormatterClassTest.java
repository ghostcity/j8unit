package org.j8unit.repository.java.util.logging;

import java.util.logging.XMLFormatter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLFormatter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.logging.XMLFormatterClassTests}).
 */
@RunWith(J8Unit4.class)
public class XMLFormatterClassTest
implements XMLFormatterClassTests<XMLFormatter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.XMLFormatter]

    @Override
    public Class<XMLFormatter> createNewSUT() {
        return XMLFormatter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.logging.XMLFormatter#XMLFormatter()
     * public java.util.logging.XMLFormatter()}.
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
    public void create_XMLFormatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XMLFormatter sut = new XMLFormatter();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.XMLFormatter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.XMLFormatter]

}
