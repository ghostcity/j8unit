package org.j8unit.repository.javax.xml.transform.sax;

import javax.xml.transform.sax.SAXResult;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SAXResult} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.transform.sax.SAXResultClassTests}).
 */
@RunWith(J8Unit4.class)
public class SAXResultClassTest
implements SAXResultClassTests<SAXResult> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.sax.SAXResult]

    @Override
    public Class<SAXResult> createNewSUT() {
        return SAXResult.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.transform.sax.SAXResult#SAXResult(org.xml.sax.ContentHandler) public
     * javax.xml.transform.sax.SAXResult(org.xml.sax.ContentHandler)}.
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
    public void create_SAXResult_ContentHandler()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SAXResult sut = null; // = new SAXResult(org.xml.sax.ContentHandler);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.xml.transform.sax.SAXResult#SAXResult()
     * public javax.xml.transform.sax.SAXResult()}.
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
    public void create_SAXResult()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SAXResult sut = new SAXResult();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.sax.SAXResult]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.sax.SAXResult]

}
