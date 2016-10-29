package org.j8unit.repository.javax.sound.midi;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Sequencer.SyncMode;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class SequencerTest
implements org.j8unit.repository.javax.sound.midi.SequencerTests<Sequencer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Sequencer]

    @Override
    public Sequencer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.Sequencer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Sequencer]

    @RunWith(J8Unit4.class)
    public static class SyncModeTest
    implements org.j8unit.repository.javax.sound.midi.SequencerTests.SyncModeTests<SyncMode> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Sequencer$SyncMode]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(SyncMode.INTERNAL_CLOCK, //
                                    SyncMode.MIDI_SYNC, //
                                    SyncMode.NO_SYNC, //
                                    SyncMode.MIDI_TIME_CODE);
        }

        @Parameter(0)
        public SyncMode sut;

        @Override
        public SyncMode createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Sequencer$SyncMode]

    }

}