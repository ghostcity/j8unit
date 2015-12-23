package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.Deprecated interface java.lang.Deprecated}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.java.lang.DeprecatedTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.DeprecatedClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.Deprecated
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DeprecatedTests<SUT extends java.lang.Deprecated>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

}
