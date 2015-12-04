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
 * Test class for {@link org.omg.DynamicAny.DynValueBoxOperations interface org.omg.DynamicAny.DynValueBoxOperations},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.DynamicAny.DynValueBoxOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynValueBoxOperationsTests<SUT extends org.omg.DynamicAny.DynValueBoxOperations>
extends org.j8unit.repository.org.omg.DynamicAny.DynValueCommonOperationsTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynValueBoxOperations#get_boxed_value_as_dyn_any() public abstract org.omg.DynamicAny.DynAny org.omg.DynamicAny.DynValueBoxOperations.get_boxed_value_as_dyn_any() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_boxed_value_as_dyn_any() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynValueBoxOperations#set_boxed_value(org.omg.CORBA.Any) public abstract void org.omg.DynamicAny.DynValueBoxOperations.set_boxed_value(org.omg.CORBA.Any) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_boxed_value_Any() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynValueBoxOperations#set_boxed_value_as_dyn_any(org.omg.DynamicAny.DynAny) public abstract void org.omg.DynamicAny.DynValueBoxOperations.set_boxed_value_as_dyn_any(org.omg.DynamicAny.DynAny) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_set_boxed_value_as_dyn_any_DynAny() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.DynamicAny.DynValueBoxOperations#get_boxed_value() public abstract org.omg.CORBA.Any org.omg.DynamicAny.DynValueBoxOperations.get_boxed_value() throws org.omg.DynamicAny.DynAnyPackage.InvalidValue}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get_boxed_value() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
