package org.j8unit.repository.java.awt.geom;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.geom.GeneralPath class java.awt.geom.GeneralPath}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.geom.GeneralPathTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.geom.GeneralPathClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.geom.GeneralPath
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GeneralPathTests<SUT extends java.awt.geom.GeneralPath>
extends org.j8unit.repository.java.awt.geom.Path2DTests.FloatTests<SUT> {

}
