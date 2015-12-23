package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.SQLInvalidAuthorizationSpecException class
 * java.sql.SQLInvalidAuthorizationSpecException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.sql.SQLInvalidAuthorizationSpecExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.SQLInvalidAuthorizationSpecExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.SQLInvalidAuthorizationSpecException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SQLInvalidAuthorizationSpecExceptionTests<SUT extends java.sql.SQLInvalidAuthorizationSpecException>
extends org.j8unit.repository.java.sql.SQLNonTransientExceptionTests<SUT> {

}
