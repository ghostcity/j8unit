package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SysexMessageTest
implements org.j8unit.repository.javax.sound.midi.SysexMessageTests<javax.sound.midi.SysexMessage> {

    @Override
    public javax.sound.midi.SysexMessage createNewSUT() {
        return new javax.sound.midi.SysexMessage();
    }

}