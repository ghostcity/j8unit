package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.w3c.dom.html.HTMLDirectoryElement interface org.w3c.dom.html.HTMLDirectoryElement},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.html.HTMLDirectoryElementClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HTMLDirectoryElementTests<SUT extends org.w3c.dom.html.HTMLDirectoryElement>
extends org.j8unit.repository.org.w3c.dom.html.HTMLElementTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.w3c.dom.html.HTMLDirectoryElement#setCompact(boolean) public abstract void
     * org.w3c.dom.html.HTMLDirectoryElement.setCompact(boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setCompact_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.html.HTMLDirectoryElement#getCompact() public abstract boolean
     * org.w3c.dom.html.HTMLDirectoryElement.getCompact()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCompact()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
