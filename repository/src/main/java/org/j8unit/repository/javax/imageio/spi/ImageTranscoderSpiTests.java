package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.imageio.spi.ImageTranscoderSpi class
 * javax.imageio.spi.ImageTranscoderSpi}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.imageio.spi.ImageTranscoderSpiTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.imageio.spi.ImageTranscoderSpiClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.imageio.spi.ImageTranscoderSpi
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ImageTranscoderSpiTests<SUT extends javax.imageio.spi.ImageTranscoderSpi>
extends org.j8unit.repository.javax.imageio.spi.IIOServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageTranscoderSpi#createTranscoderInstance() public abstract
     * javax.imageio.ImageTranscoder javax.imageio.spi.ImageTranscoderSpi.createTranscoderInstance()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.spi.ImageTranscoderSpi#createTranscoderInstance()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createTranscoderInstance()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageTranscoderSpi#getReaderServiceProviderName() public abstract
     * java.lang.String javax.imageio.spi.ImageTranscoderSpi.getReaderServiceProviderName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.spi.ImageTranscoderSpi#getReaderServiceProviderName()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReaderServiceProviderName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageTranscoderSpi#getWriterServiceProviderName() public abstract
     * java.lang.String javax.imageio.spi.ImageTranscoderSpi.getWriterServiceProviderName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.spi.ImageTranscoderSpi#getWriterServiceProviderName()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWriterServiceProviderName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
