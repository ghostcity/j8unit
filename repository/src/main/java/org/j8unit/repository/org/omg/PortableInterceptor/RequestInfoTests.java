package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.RequestInfo interface org.omg.PortableInterceptor.RequestInfo},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.RequestInfoClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RequestInfoTests<SUT extends org.omg.PortableInterceptor.RequestInfo>
extends org.j8unit.repository.org.omg.PortableInterceptor.RequestInfoOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}