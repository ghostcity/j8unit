package org.j8unit.shapes;

import static org.junit.Assert.assertEquals;
import org.j8unit.J8UnitTest;
import org.j8unit.shapes.Rectangle;
import org.junit.Test;

public abstract interface JMRectangleTest<R extends Rectangle>
extends J8UnitTest<R> {

    @Test
    public default void testScalingAreaByScalingWidth() {
        final R sut = this.createNewSUT();
        final double oldArea = sut.getArea();
        sut.setWidth(2 * sut.getWidth());
        final double newArea = sut.getArea();
        assertEquals(newArea, 2 * oldArea, 0.0);
    }

    @Test
    public default void testScalingAreaByScalingHeight() {
        final R sut = this.createNewSUT();
        final double oldArea = sut.getArea();
        sut.setHeight(2 * sut.getHeight());
        final double newArea = sut.getArea();
        assertEquals(newArea, 2 * oldArea, 0.0);
    }
}