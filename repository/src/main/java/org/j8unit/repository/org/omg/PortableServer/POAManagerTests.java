package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.POAManager interface org.omg.PortableServer.POAManager},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.POAManagerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface POAManagerTests<SUT extends org.omg.PortableServer.POAManager>
extends org.j8unit.repository.org.omg.PortableServer.POAManagerOperationsTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>
{

}
