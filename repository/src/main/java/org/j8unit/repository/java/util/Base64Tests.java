package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.Base64 class java.util.Base64}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test
 * interface containing the class relevant test methods is {@link org.j8unit.repository.java.util.Base64Tests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.Base64ClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.Base64
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface Base64Tests<SUT extends java.util.Base64>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.Base64.Decoder class java.util.Base64$Decoder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
     * counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.util.Base64Tests.DecoderTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.Base64ClassTests.DecoderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.Base64.Decoder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DecoderTests<SUT extends java.util.Base64.Decoder>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Base64.Decoder#decode(byte[]) public byte[]
         * java.util.Base64$Decoder.decode(byte[])}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Decoder#decode(byte[])
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_decode_byteArray()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Base64.Decoder#decode(byte[], byte[]) public int
         * java.util.Base64$Decoder.decode(byte[],byte[])}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Decoder#decode(byte[], byte[])
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_decode_byteArray_byteArray()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Base64.Decoder#decode(java.nio.ByteBuffer) public java.nio.ByteBuffer
         * java.util.Base64$Decoder.decode(java.nio.ByteBuffer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Decoder#decode(java.nio.ByteBuffer)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_decode_ByteBuffer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Base64.Decoder#decode(java.lang.String) public byte[]
         * java.util.Base64$Decoder.decode(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Decoder#decode(java.lang.String)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_decode_String()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Base64.Decoder#wrap(java.io.InputStream) public java.io.InputStream
         * java.util.Base64$Decoder.wrap(java.io.InputStream)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Decoder#wrap(java.io.InputStream)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_wrap_InputStream()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.util.Base64.Encoder class java.util.Base64$Encoder},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
     * counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.util.Base64Tests.EncoderTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.util.Base64ClassTests.EncoderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.util.Base64.Encoder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EncoderTests<SUT extends java.util.Base64.Encoder>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.util.Base64.Encoder#encode(byte[]) public byte[]
         * java.util.Base64$Encoder.encode(byte[])}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Encoder#encode(byte[])
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_encode_byteArray()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Base64.Encoder#encode(byte[], byte[]) public int
         * java.util.Base64$Encoder.encode(byte[],byte[])}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Encoder#encode(byte[], byte[])
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_encode_byteArray_byteArray()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Base64.Encoder#encode(java.nio.ByteBuffer) public java.nio.ByteBuffer
         * java.util.Base64$Encoder.encode(java.nio.ByteBuffer)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Encoder#encode(java.nio.ByteBuffer)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_encode_ByteBuffer()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Base64.Encoder#encodeToString(byte[]) public java.lang.String
         * java.util.Base64$Encoder.encodeToString(byte[])}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Encoder#encodeToString(byte[])
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_encodeToString_byteArray()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Base64.Encoder#withoutPadding() public java.util.Base64$Encoder
         * java.util.Base64$Encoder.withoutPadding()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Encoder#withoutPadding()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_withoutPadding()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.util.Base64.Encoder#wrap(java.io.OutputStream) public java.io.OutputStream
         * java.util.Base64$Encoder.wrap(java.io.OutputStream)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.util.Base64.Encoder#wrap(java.io.OutputStream)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_wrap_OutputStream()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
