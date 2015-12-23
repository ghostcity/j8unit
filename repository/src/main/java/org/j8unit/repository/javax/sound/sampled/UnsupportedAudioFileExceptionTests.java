package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.sampled.UnsupportedAudioFileException class
 * javax.sound.sampled.UnsupportedAudioFileException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.sound.sampled.UnsupportedAudioFileExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.sampled.UnsupportedAudioFileExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.sampled.UnsupportedAudioFileException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnsupportedAudioFileExceptionTests<SUT extends javax.sound.sampled.UnsupportedAudioFileException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}
