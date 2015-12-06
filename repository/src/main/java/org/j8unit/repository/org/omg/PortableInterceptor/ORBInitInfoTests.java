package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.ORBInitInfo interface org.omg.PortableInterceptor.ORBInitInfo},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ORBInitInfoTests<SUT extends org.omg.PortableInterceptor.ORBInitInfo>
extends org.j8unit.repository.org.omg.PortableInterceptor.ORBInitInfoOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}