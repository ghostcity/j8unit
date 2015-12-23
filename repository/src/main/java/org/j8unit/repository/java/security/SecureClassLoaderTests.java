package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.SecureClassLoader class java.security.SecureClassLoader}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.security.SecureClassLoaderTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.SecureClassLoaderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.SecureClassLoader
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SecureClassLoaderTests<SUT extends java.security.SecureClassLoader>
extends org.j8unit.repository.java.lang.ClassLoaderTests<SUT> {

}
