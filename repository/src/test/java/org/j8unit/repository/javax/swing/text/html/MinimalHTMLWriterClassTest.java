package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.MinimalHTMLWriter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MinimalHTMLWriter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.MinimalHTMLWriterClassTests}).
 */
@RunWith(J8Unit4.class)
public class MinimalHTMLWriterClassTest
implements MinimalHTMLWriterClassTests<MinimalHTMLWriter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.MinimalHTMLWriter]

    @Override
    public Class<MinimalHTMLWriter> createNewSUT() {
        return MinimalHTMLWriter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.MinimalHTMLWriter#MinimalHTMLWriter(java.io.Writer, javax.swing.text.StyledDocument, int, int)
     * public javax.swing.text.html.MinimalHTMLWriter(java.io.Writer,javax.swing.text.StyledDocument,int,int)}.
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
    public void create_MinimalHTMLWriter_Writer_StyledDocument_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MinimalHTMLWriter sut = null; // = new MinimalHTMLWriter(java.io.Writer, javax.swing.text.StyledDocument,
                                            // int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.MinimalHTMLWriter#MinimalHTMLWriter(java.io.Writer, javax.swing.text.StyledDocument)
     * public javax.swing.text.html.MinimalHTMLWriter(java.io.Writer,javax.swing.text.StyledDocument)}.
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
    public void create_MinimalHTMLWriter_Writer_StyledDocument()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MinimalHTMLWriter sut = null; // = new MinimalHTMLWriter(java.io.Writer, javax.swing.text.StyledDocument);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.MinimalHTMLWriter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.MinimalHTMLWriter]

}
