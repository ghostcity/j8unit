package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.lang.model.element.ElementVisitor interface
 * javax.lang.model.element.ElementVisitor}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.lang.model.element.ElementVisitorTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.lang.model.element.ElementVisitorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.lang.model.element.ElementVisitor
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ElementVisitorTests<SUT extends javax.lang.model.element.ElementVisitor<R, P>, R, P>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.ElementVisitor#visit(javax.lang.model.element.Element) public
     * abstract java.lang.Object javax.lang.model.element.ElementVisitor.visit(javax.lang.model.element.Element)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.ElementVisitor#visit(javax.lang.model.element.Element)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visit_Element()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.ElementVisitor#visit(javax.lang.model.element.Element, java.lang.Object) public
     * abstract java.lang.Object
     * javax.lang.model.element.ElementVisitor.visit(javax.lang.model.element.Element,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.ElementVisitor#visit(javax.lang.model.element.Element, java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visit_Element_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.ElementVisitor#visitExecutable(javax.lang.model.element.ExecutableElement, java.lang.Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.ElementVisitor.visitExecutable(javax.lang.model.element.ExecutableElement,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.ElementVisitor#visitExecutable(javax.lang.model.element.ExecutableElement,
     *             java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitExecutable_ExecutableElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.ElementVisitor#visitPackage(javax.lang.model.element.PackageElement, java.lang.Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.ElementVisitor.visitPackage(javax.lang.model.element.PackageElement,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.ElementVisitor#visitPackage(javax.lang.model.element.PackageElement,
     *             java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitPackage_PackageElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.ElementVisitor#visitType(javax.lang.model.element.TypeElement, java.lang.Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.ElementVisitor.visitType(javax.lang.model.element.TypeElement,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.ElementVisitor#visitType(javax.lang.model.element.TypeElement,
     *             java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitType_TypeElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.ElementVisitor#visitTypeParameter(javax.lang.model.element.TypeParameterElement, java.lang.Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.ElementVisitor.visitTypeParameter(javax.lang.model.element.TypeParameterElement,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.ElementVisitor#visitTypeParameter(javax.lang.model.element.
     *             TypeParameterElement, java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitTypeParameter_TypeParameterElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.ElementVisitor#visitUnknown(javax.lang.model.element.Element, java.lang.Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.ElementVisitor.visitUnknown(javax.lang.model.element.Element,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.ElementVisitor#visitUnknown(javax.lang.model.element.Element,
     *             java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitUnknown_Element_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.ElementVisitor#visitVariable(javax.lang.model.element.VariableElement, java.lang.Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.ElementVisitor.visitVariable(javax.lang.model.element.VariableElement,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.element.ElementVisitor#visitVariable(javax.lang.model.element.VariableElement,
     *             java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitVariable_VariableElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
