package org.j8unit.repository.java.time.temporal;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.time.temporal.TemporalQuery interface java.time.temporal.TemporalQuery}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.temporal.TemporalQueryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TemporalQueryTests<SUT extends java.time.temporal.TemporalQuery<R>, R>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalQuery#queryFrom(java.time.temporal.TemporalAccessor) public
     * abstract java.lang.Object java.time.temporal.TemporalQuery.queryFrom(java.time.temporal.TemporalAccessor)}.
     * </p>
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
