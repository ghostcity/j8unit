package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.w3c.dom.css.CSSFontFaceRule interface
 * org.w3c.dom.css.CSSFontFaceRule}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.w3c.dom.css.CSSFontFaceRuleTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.w3c.dom.css.CSSFontFaceRuleClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.w3c.dom.css.CSSFontFaceRule
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CSSFontFaceRuleTests<SUT extends org.w3c.dom.css.CSSFontFaceRule>
extends org.j8unit.repository.org.w3c.dom.css.CSSRuleTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.css.CSSFontFaceRule#getStyle() public abstract
     * org.w3c.dom.css.CSSStyleDeclaration org.w3c.dom.css.CSSFontFaceRule.getStyle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.css.CSSFontFaceRule#getStyle()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
