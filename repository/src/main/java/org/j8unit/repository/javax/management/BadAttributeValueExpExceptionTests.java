package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.BadAttributeValueExpException class
 * javax.management.BadAttributeValueExpException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.BadAttributeValueExpExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.BadAttributeValueExpExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.BadAttributeValueExpException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BadAttributeValueExpExceptionTests<SUT extends javax.management.BadAttributeValueExpException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.BadAttributeValueExpException#toString() public java.lang.String
     * javax.management.BadAttributeValueExpException.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.BadAttributeValueExpException#toString()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
