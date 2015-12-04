package org.j8unit.repository.org.w3c.dom.stylesheets;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.w3c.dom.stylesheets.DocumentStyle interface org.w3c.dom.stylesheets.DocumentStyle},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.stylesheets.DocumentStyleClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DocumentStyleTests<SUT extends org.w3c.dom.stylesheets.DocumentStyle>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link org.w3c.dom.stylesheets.DocumentStyle#getStyleSheets() public abstract org.w3c.dom.stylesheets.StyleSheetList org.w3c.dom.stylesheets.DocumentStyle.getStyleSheets()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyleSheets() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
