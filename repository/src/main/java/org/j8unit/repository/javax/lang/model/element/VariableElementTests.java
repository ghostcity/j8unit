package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.lang.model.element.VariableElement interface javax.lang.model.element.VariableElement},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.VariableElementClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface VariableElementTests<SUT extends javax.lang.model.element.VariableElement>
extends org.j8unit.repository.javax.lang.model.element.ElementTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getSimpleName() public abstract javax.lang.model.element.Name javax.lang.model.element.VariableElement.getSimpleName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getSimpleName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getEnclosingElement() public abstract javax.lang.model.element.Element javax.lang.model.element.VariableElement.getEnclosingElement()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getEnclosingElement() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.VariableElement#getConstantValue() public abstract java.lang.Object javax.lang.model.element.VariableElement.getConstantValue()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getConstantValue() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
