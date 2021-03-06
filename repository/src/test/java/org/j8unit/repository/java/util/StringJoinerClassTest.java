package org.j8unit.repository.java.util;

import java.util.StringJoiner;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StringJoiner} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.StringJoinerClassTests}).
 */
@RunWith(J8Unit4.class)
public class StringJoinerClassTest
implements StringJoinerClassTests<StringJoiner> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.StringJoiner]

    @Override
    public Class<StringJoiner> createNewSUT() {
        return StringJoiner.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.StringJoiner#StringJoiner(CharSequence) public java.util.StringJoiner(java.lang.CharSequence)}.
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
    public void create_StringJoiner_CharSequence()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringJoiner sut = null; // = new StringJoiner(CharSequence);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.StringJoiner#StringJoiner(CharSequence, CharSequence, CharSequence) public
     * java.util.StringJoiner(java.lang.CharSequence,java.lang.CharSequence,java.lang.CharSequence)}.
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
    public void create_StringJoiner_CharSequence_CharSequence_CharSequence()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StringJoiner sut = null; // = new StringJoiner(CharSequence, CharSequence, CharSequence);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.StringJoiner]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.StringJoiner]

}
