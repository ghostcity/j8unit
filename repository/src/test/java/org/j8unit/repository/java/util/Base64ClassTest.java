package org.j8unit.repository.java.util;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Base64} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.Base64ClassTests}).
 */
@RunWith(J8Unit4.class)
public class Base64ClassTest
implements Base64ClassTests<Base64> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Base64]

    @Override
    public Class<Base64> createNewSUT() {
        return Base64.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Base64#getMimeDecoder() public static
     * java.util.Base64$Decoder java.util.Base64.getMimeDecoder()}.
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
    public void test_getMimeDecoder()
    throws Exception {
        // write some test for {@link java.util.Base64#getMimeDecoder()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Base64#getDecoder() public static
     * java.util.Base64$Decoder java.util.Base64.getDecoder()}.
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
    public void test_getDecoder()
    throws Exception {
        // write some test for {@link java.util.Base64#getDecoder()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Base64#getUrlEncoder() public static
     * java.util.Base64$Encoder java.util.Base64.getUrlEncoder()}.
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
    public void test_getUrlEncoder()
    throws Exception {
        // write some test for {@link java.util.Base64#getUrlEncoder()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Base64#getMimeEncoder() public static
     * java.util.Base64$Encoder java.util.Base64.getMimeEncoder()}.
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
    public void test_getMimeEncoder()
    throws Exception {
        // write some test for {@link java.util.Base64#getMimeEncoder()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Base64#getMimeEncoder(int, byte[]) public
     * static java.util.Base64$Encoder java.util.Base64.getMimeEncoder(int,byte[])}.
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
    public void test_getMimeEncoder_int_byteArray()
    throws Exception {
        // write some test for {@link java.util.Base64#getMimeEncoder(int, byte[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Base64#getEncoder() public static
     * java.util.Base64$Encoder java.util.Base64.getEncoder()}.
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
    public void test_getEncoder()
    throws Exception {
        // write some test for {@link java.util.Base64#getEncoder()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Base64#getUrlDecoder() public static
     * java.util.Base64$Decoder java.util.Base64.getUrlDecoder()}.
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
    public void test_getUrlDecoder()
    throws Exception {
        // write some test for {@link java.util.Base64#getUrlDecoder()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Base64]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Base64]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Encoder} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.Base64ClassTests.EncoderClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class EncoderClassTest
    implements EncoderClassTests<Encoder> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Base64$Encoder]

        @Override
        public Class<Encoder> createNewSUT() {
            return Encoder.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Base64$Encoder]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Base64$Encoder]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Decoder} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.Base64ClassTests.DecoderClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DecoderClassTest
    implements DecoderClassTests<Decoder> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Base64$Decoder]

        @Override
        public Class<Decoder> createNewSUT() {
            return Decoder.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Base64$Decoder]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Base64$Decoder]

    }

}
