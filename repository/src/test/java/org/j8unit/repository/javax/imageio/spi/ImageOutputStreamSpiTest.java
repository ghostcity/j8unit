package org.j8unit.repository.javax.imageio.spi;

import javax.imageio.spi.ImageOutputStreamSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageOutputStreamSpiTest
implements org.j8unit.repository.javax.imageio.spi.ImageOutputStreamSpiTests<ImageOutputStreamSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ImageOutputStreamSpi]

    @Override
    public ImageOutputStreamSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.spi.ImageOutputStreamSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.spi.ImageOutputStreamSpi]

}