package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.bind.ValidationException class
 * javax.xml.bind.ValidationException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.bind.ValidationExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.bind.ValidationExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.bind.ValidationException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValidationExceptionTests<SUT extends javax.xml.bind.ValidationException>
extends org.j8unit.repository.javax.xml.bind.JAXBExceptionTests<SUT> {

}
