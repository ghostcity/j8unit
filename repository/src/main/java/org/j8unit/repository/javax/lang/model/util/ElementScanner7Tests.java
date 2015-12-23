package org.j8unit.repository.javax.lang.model.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.lang.model.util.ElementScanner7 class
 * javax.lang.model.util.ElementScanner7}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.lang.model.util.ElementScanner7Tests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.lang.model.util.ElementScanner7ClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.lang.model.util.ElementScanner7
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ElementScanner7Tests<SUT extends javax.lang.model.util.ElementScanner7<R, P>, R, P>
extends org.j8unit.repository.javax.lang.model.util.ElementScanner6Tests<SUT, R, P> {

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.util.ElementScanner7#visitVariable(javax.lang.model.element.VariableElement, java.lang.Object)
     * public java.lang.Object
     * javax.lang.model.util.ElementScanner7.visitVariable(javax.lang.model.element.VariableElement,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.util.ElementScanner7#visitVariable(javax.lang.model.element.VariableElement,
     *             java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_visitVariable_VariableElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
