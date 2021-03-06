package org.j8unit.repository.javax.sound.sampled.spi;

import javax.sound.sampled.spi.MixerProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MixerProvider} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sound.sampled.spi.MixerProviderTests}).
 */
@RunWith(J8Unit4.class)
public class MixerProviderTest
implements MixerProviderTests<MixerProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.sampled.spi.MixerProvider]

    @Override
    public MixerProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.sampled.spi.MixerProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.sampled.spi.MixerProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.sampled.spi.MixerProvider]

}
