package org.j8unit.repository.javax.security.auth.kerberos;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.security.auth.kerberos.DelegationPermission class javax.security.auth.kerberos.DelegationPermission},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.auth.kerberos.DelegationPermissionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DelegationPermissionTests<SUT extends javax.security.auth.kerberos.DelegationPermission>
extends org.j8unit.repository.java.io.SerializableTests<SUT>,
        org.j8unit.repository.java.security.BasicPermissionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.DelegationPermission#hashCode() public int javax.security.auth.kerberos.DelegationPermission.hashCode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hashCode() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.DelegationPermission#equals(java.lang.Object) public boolean javax.security.auth.kerberos.DelegationPermission.equals(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_equals_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.DelegationPermission#newPermissionCollection() public java.security.PermissionCollection javax.security.auth.kerberos.DelegationPermission.newPermissionCollection()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_newPermissionCollection() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.kerberos.DelegationPermission#implies(java.security.Permission) public boolean javax.security.auth.kerberos.DelegationPermission.implies(java.security.Permission)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_implies_Permission() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
