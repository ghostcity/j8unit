package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.rmi.CORBA.ClassDesc class javax.rmi.CORBA.ClassDesc}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.rmi.CORBA.ClassDescTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.rmi.CORBA.ClassDescClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.rmi.CORBA.ClassDesc
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClassDescTests<SUT extends javax.rmi.CORBA.ClassDesc>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
