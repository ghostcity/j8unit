package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.relation.RelationTypeSupport class
 * javax.management.relation.RelationTypeSupport}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.relation.RelationTypeSupportClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RelationTypeSupportTests<SUT extends javax.management.relation.RelationTypeSupport>
extends org.j8unit.repository.javax.management.relation.RelationTypeTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationTypeSupport#getRelationTypeName() public
     * java.lang.String javax.management.relation.RelationTypeSupport.getRelationTypeName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRelationTypeName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationTypeSupport#getRoleInfo(java.lang.String) public
     * javax.management.relation.RoleInfo javax.management.relation.RelationTypeSupport.getRoleInfo(java.lang.String)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RoleInfoNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRoleInfo_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationTypeSupport#getRoleInfos() public java.util.List
     * javax.management.relation.RelationTypeSupport.getRoleInfos()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getRoleInfos()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
