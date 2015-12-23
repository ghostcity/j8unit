package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.midi.MidiUnavailableException class
 * javax.sound.midi.MidiUnavailableException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.midi.MidiUnavailableExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.midi.MidiUnavailableExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.midi.MidiUnavailableException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiUnavailableExceptionTests<SUT extends javax.sound.midi.MidiUnavailableException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
