package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.type.IntersectionType interface javax.lang.model.type.IntersectionType},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.type.IntersectionTypeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IntersectionTypeTests<SUT extends javax.lang.model.type.IntersectionType>
extends org.j8unit.repository.javax.lang.model.type.TypeMirrorTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.IntersectionType#getBounds() public abstract java.util.List
     * javax.lang.model.type.IntersectionType.getBounds()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBounds()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
