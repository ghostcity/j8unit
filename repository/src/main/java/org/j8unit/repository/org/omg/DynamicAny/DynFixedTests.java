package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.DynamicAny.DynFixed interface org.omg.DynamicAny.DynFixed},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.DynamicAny.DynFixedClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynFixedTests<SUT extends org.omg.DynamicAny.DynFixed>
extends org.j8unit.repository.org.omg.DynamicAny.DynFixedOperationsTests<SUT>,
        org.j8unit.repository.org.omg.DynamicAny.DynAnyTests<SUT>,
        org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>
{

}
