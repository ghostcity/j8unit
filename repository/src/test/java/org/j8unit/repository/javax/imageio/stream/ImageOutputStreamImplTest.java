package org.j8unit.repository.javax.imageio.stream;

import javax.imageio.stream.ImageOutputStreamImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageOutputStreamImplTest
implements org.j8unit.repository.javax.imageio.stream.ImageOutputStreamImplTests<ImageOutputStreamImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.stream.ImageOutputStreamImpl]

    @Override
    public ImageOutputStreamImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.imageio.stream.ImageOutputStreamImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.imageio.stream.ImageOutputStreamImpl]

}