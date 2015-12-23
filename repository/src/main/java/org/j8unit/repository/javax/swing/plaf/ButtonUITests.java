package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.ButtonUI class javax.swing.plaf.ButtonUI}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.ButtonUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.ButtonUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.ButtonUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ButtonUITests<SUT extends javax.swing.plaf.ButtonUI>
extends org.j8unit.repository.javax.swing.plaf.ComponentUITests<SUT> {

}
