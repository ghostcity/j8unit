package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.html.HTMLTableCaptionElement interface org.w3c.dom.html.HTMLTableCaptionElement},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.html.HTMLTableCaptionElementClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HTMLTableCaptionElementTests<SUT extends org.w3c.dom.html.HTMLTableCaptionElement>
extends org.j8unit.repository.org.w3c.dom.html.HTMLElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.html.HTMLTableCaptionElement#getAlign() public abstract java.lang.String
     * org.w3c.dom.html.HTMLTableCaptionElement.getAlign()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlign()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.html.HTMLTableCaptionElement#setAlign(java.lang.String) public abstract void
     * org.w3c.dom.html.HTMLTableCaptionElement.setAlign(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAlign_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
