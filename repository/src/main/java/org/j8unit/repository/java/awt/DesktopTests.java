package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.Desktop class java.awt.Desktop}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test
 * interface containing the class relevant test methods is {@link org.j8unit.repository.java.awt.DesktopTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.DesktopClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.Desktop
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DesktopTests<SUT extends java.awt.Desktop>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.awt.Desktop.Action class java.awt.Desktop$Action}, containing
     * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart
     * J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.awt.DesktopTests.ActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.awt.DesktopClassTests.ActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.awt.Desktop.Action
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ActionTests<SUT extends java.awt.Desktop.Action>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, java.awt.Desktop.Action> {

    }

    /**
     * <p>
     * Test method for {@link java.awt.Desktop#browse(java.net.URI) public void java.awt.Desktop.browse(java.net.URI)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.Desktop#browse(java.net.URI)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_browse_URI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Desktop#edit(java.io.File) public void java.awt.Desktop.edit(java.io.File) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.Desktop#edit(java.io.File)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_edit_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Desktop#isSupported(java.awt.Desktop.Action) public boolean
     * java.awt.Desktop.isSupported(java.awt.Desktop$Action)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.Desktop#isSupported(java.awt.Desktop.Action)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSupported_Action()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Desktop#mail() public void java.awt.Desktop.mail() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.Desktop#mail()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mail()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Desktop#mail(java.net.URI) public void java.awt.Desktop.mail(java.net.URI) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.Desktop#mail(java.net.URI)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mail_URI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Desktop#open(java.io.File) public void java.awt.Desktop.open(java.io.File) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.Desktop#open(java.io.File)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_open_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.Desktop#print(java.io.File) public void java.awt.Desktop.print(java.io.File)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.Desktop#print(java.io.File)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_print_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
