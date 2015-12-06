package org.j8unit.repository.java.awt.image;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.image.RasterOp interface java.awt.image.RasterOp}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.image.RasterOpClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RasterOpTests<SUT extends java.awt.image.RasterOp>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.image.RasterOp#createCompatibleDestRaster(java.awt.image.Raster) public abstract
     * java.awt.image.WritableRaster java.awt.image.RasterOp.createCompatibleDestRaster(java.awt.image.Raster)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createCompatibleDestRaster_Raster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.RasterOp#filter(java.awt.image.Raster,java.awt.image.WritableRaster) public
     * abstract java.awt.image.WritableRaster
     * java.awt.image.RasterOp.filter(java.awt.image.Raster,java.awt.image.WritableRaster)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_filter_Raster_WritableRaster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.RasterOp#getBounds2D(java.awt.image.Raster) public abstract
     * java.awt.geom.Rectangle2D java.awt.image.RasterOp.getBounds2D(java.awt.image.Raster)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBounds2D_Raster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.RasterOp#getPoint2D(java.awt.geom.Point2D,java.awt.geom.Point2D) public
     * abstract java.awt.geom.Point2D java.awt.image.RasterOp.getPoint2D(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPoint2D_Point2D_Point2D()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.RasterOp#getRenderingHints() public abstract java.awt.RenderingHints
     * java.awt.image.RasterOp.getRenderingHints()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRenderingHints()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}