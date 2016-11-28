package org.j8unit.repository.java.time.temporal;

import java.time.temporal.WeekFields;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WeekFields} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.time.temporal.WeekFieldsClassTests}).
 */
@RunWith(J8Unit4.class)
public class WeekFieldsClassTest
implements WeekFieldsClassTests<WeekFields> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.WeekFields]

    @Override
    public Class<WeekFields> createNewSUT() {
        return WeekFields.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.time.temporal.WeekFields#of(java.time.DayOfWeek, int) public static java.time.temporal.WeekFields
     * java.time.temporal.WeekFields.of(java.time.DayOfWeek,int)}.
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
    public void test_of_DayOfWeek_int()
    throws Exception {
        // write some test for {@link java.time.temporal.WeekFields#of(java.time.DayOfWeek, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.temporal.WeekFields#of(java.util.Locale)
     * public static java.time.temporal.WeekFields java.time.temporal.WeekFields.of(java.util.Locale)}.
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
    public void test_of_Locale()
    throws Exception {
        // write some test for {@link java.time.temporal.WeekFields#of(java.util.Locale)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.WeekFields]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.WeekFields]

}
