package org.j8unit.repository.java.time.chrono;

import java.time.chrono.IsoEra;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IsoEra} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.time.chrono.IsoEraClassTests}).
 */
@RunWith(J8Unit4.class)
public class IsoEraClassTest
implements IsoEraClassTests<IsoEra> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.IsoEra]

    @Override
    public Class<IsoEra> createNewSUT() {
        return IsoEra.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.chrono.IsoEra#values() public static
     * java.time.chrono.IsoEra[] java.time.chrono.IsoEra.values()}.
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
    public void test_values()
    throws Exception {
        // write some test for {@link java.time.chrono.IsoEra#values()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.chrono.IsoEra#of(int) public static
     * java.time.chrono.IsoEra java.time.chrono.IsoEra.of(int)}.
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
    public void test_of_int()
    throws Exception {
        // write some test for {@link java.time.chrono.IsoEra#of(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.chrono.IsoEra#valueOf(String) public
     * static java.time.chrono.IsoEra java.time.chrono.IsoEra.valueOf(java.lang.String)}.
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
    public void test_valueOf_String()
    throws Exception {
        // write some test for {@link java.time.chrono.IsoEra#valueOf(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.chrono.IsoEra]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.IsoEra]

}
