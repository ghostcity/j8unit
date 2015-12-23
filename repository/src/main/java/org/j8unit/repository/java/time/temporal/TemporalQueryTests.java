package org.j8unit.repository.java.time.temporal;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.temporal.TemporalQuery interface
 * java.time.temporal.TemporalQuery}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.time.temporal.TemporalQueryTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.time.temporal.TemporalQueryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.temporal.TemporalQuery
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemporalQueryTests<SUT extends java.time.temporal.TemporalQuery<R>, R>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalQuery#queryFrom(java.time.temporal.TemporalAccessor) public
     * abstract java.lang.Object java.time.temporal.TemporalQuery.queryFrom(java.time.temporal.TemporalAccessor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.time.temporal.TemporalQuery#queryFrom(java.time.temporal.TemporalAccessor)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_queryFrom_TemporalAccessor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
