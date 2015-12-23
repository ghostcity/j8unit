package org.j8unit.repository.java.time.zone;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.time.zone.ZoneRulesProvider class
 * java.time.zone.ZoneRulesProvider}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.time.zone.ZoneRulesProviderTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.time.zone.ZoneRulesProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.time.zone.ZoneRulesProvider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ZoneRulesProviderTests<SUT extends java.time.zone.ZoneRulesProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
