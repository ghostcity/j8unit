package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.net.URLStreamHandler class java.net.URLStreamHandler}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.net.URLStreamHandlerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.net.URLStreamHandlerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.net.URLStreamHandler
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface URLStreamHandlerTests<SUT extends java.net.URLStreamHandler>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
