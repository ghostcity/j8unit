package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableInterceptor.ServerRequestInfo interface
 * org.omg.PortableInterceptor.ServerRequestInfo}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInfoTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInfoClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableInterceptor.ServerRequestInfo
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServerRequestInfoTests<SUT extends org.omg.PortableInterceptor.ServerRequestInfo>
extends org.j8unit.repository.org.omg.PortableInterceptor.ServerRequestInfoOperationsTests<SUT>,
org.j8unit.repository.org.omg.PortableInterceptor.RequestInfoTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
