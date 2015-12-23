package org.j8unit.repository.javax.lang.model;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.lang.model.UnknownEntityException class
 * javax.lang.model.UnknownEntityException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.lang.model.UnknownEntityExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.lang.model.UnknownEntityExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.lang.model.UnknownEntityException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownEntityExceptionTests<SUT extends javax.lang.model.UnknownEntityException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
