package org.j8unit.repository.java.awt.image;

import java.awt.image.ImageConsumer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageConsumer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.ImageConsumerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ImageConsumerClassTest
implements ImageConsumerClassTests<ImageConsumer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.ImageConsumer]

    @Override
    public Class<ImageConsumer> createNewSUT() {
        return ImageConsumer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.ImageConsumer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.ImageConsumer]

}
