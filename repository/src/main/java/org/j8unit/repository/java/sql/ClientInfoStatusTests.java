package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.ClientInfoStatus class java.sql.ClientInfoStatus}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.sql.ClientInfoStatusTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.ClientInfoStatusClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.ClientInfoStatus
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClientInfoStatusTests<SUT extends java.sql.ClientInfoStatus>
extends org.j8unit.repository.java.lang.EnumTests<SUT, java.sql.ClientInfoStatus> {

}
