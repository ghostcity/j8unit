package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.DefaultLoaderRepository class
 * javax.management.DefaultLoaderRepository}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.management.DefaultLoaderRepositoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.DefaultLoaderRepositoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.DefaultLoaderRepository
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultLoaderRepositoryTests<SUT extends javax.management.DefaultLoaderRepository>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
