package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.AttributeChangeNotificationFilter class
 * javax.management.AttributeChangeNotificationFilter}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.AttributeChangeNotificationFilterTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.AttributeChangeNotificationFilterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.AttributeChangeNotificationFilter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributeChangeNotificationFilterTests<SUT extends javax.management.AttributeChangeNotificationFilter>
extends org.j8unit.repository.javax.management.NotificationFilterTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotificationFilter#disableAllAttributes() public
     * synchronized void javax.management.AttributeChangeNotificationFilter.disableAllAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.AttributeChangeNotificationFilter#disableAllAttributes()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_disableAllAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotificationFilter#disableAttribute(java.lang.String)
     * public synchronized void javax.management.AttributeChangeNotificationFilter.disableAttribute(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.AttributeChangeNotificationFilter#disableAttribute(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_disableAttribute_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotificationFilter#enableAttribute(java.lang.String)
     * public synchronized void javax.management.AttributeChangeNotificationFilter.enableAttribute(java.lang.String)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.AttributeChangeNotificationFilter#enableAttribute(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_enableAttribute_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotificationFilter#getEnabledAttributes() public
     * synchronized java.util.Vector javax.management.AttributeChangeNotificationFilter.getEnabledAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.AttributeChangeNotificationFilter#getEnabledAttributes()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnabledAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.AttributeChangeNotificationFilter#isNotificationEnabled(javax.management.Notification)
     * public synchronized boolean
     * javax.management.AttributeChangeNotificationFilter.isNotificationEnabled(javax.management.Notification)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.AttributeChangeNotificationFilter#isNotificationEnabled(javax.management.
     *             Notification)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isNotificationEnabled_Notification()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
