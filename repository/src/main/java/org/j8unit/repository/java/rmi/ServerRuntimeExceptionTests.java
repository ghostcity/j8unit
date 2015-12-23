package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.ServerRuntimeException class java.rmi.ServerRuntimeException}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.ServerRuntimeExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.ServerRuntimeExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.ServerRuntimeException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServerRuntimeExceptionTests<SUT extends java.rmi.ServerRuntimeException>
extends org.j8unit.repository.java.rmi.RemoteExceptionTests<SUT> {

}
