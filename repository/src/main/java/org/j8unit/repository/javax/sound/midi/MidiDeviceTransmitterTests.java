package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.midi.MidiDeviceTransmitter interface
 * javax.sound.midi.MidiDeviceTransmitter}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.midi.MidiDeviceTransmitterTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.midi.MidiDeviceTransmitterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.midi.MidiDeviceTransmitter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiDeviceTransmitterTests<SUT extends javax.sound.midi.MidiDeviceTransmitter>
extends org.j8unit.repository.javax.sound.midi.TransmitterTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.MidiDeviceTransmitter#getMidiDevice() public abstract
     * javax.sound.midi.MidiDevice javax.sound.midi.MidiDeviceTransmitter.getMidiDevice()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sound.midi.MidiDeviceTransmitter#getMidiDevice()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMidiDevice()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
