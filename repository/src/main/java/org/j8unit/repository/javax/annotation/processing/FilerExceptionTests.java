package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.annotation.processing.FilerException class
 * javax.annotation.processing.FilerException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.annotation.processing.FilerExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.annotation.processing.FilerExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.annotation.processing.FilerException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FilerExceptionTests<SUT extends javax.annotation.processing.FilerException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
