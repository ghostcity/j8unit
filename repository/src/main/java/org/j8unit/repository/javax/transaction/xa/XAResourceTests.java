package org.j8unit.repository.javax.transaction.xa;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.transaction.xa.XAResource interface javax.transaction.xa.XAResource},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.transaction.xa.XAResourceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XAResourceTests<SUT extends javax.transaction.xa.XAResource>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.XAResource#prepare(javax.transaction.xa.Xid) public abstract int javax.transaction.xa.XAResource.prepare(javax.transaction.xa.Xid) throws javax.transaction.xa.XAException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_prepare_Xid() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.XAResource#getTransactionTimeout() public abstract int javax.transaction.xa.XAResource.getTransactionTimeout() throws javax.transaction.xa.XAException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransactionTimeout() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.XAResource#rollback(javax.transaction.xa.Xid) public abstract void javax.transaction.xa.XAResource.rollback(javax.transaction.xa.Xid) throws javax.transaction.xa.XAException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rollback_Xid() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.XAResource#recover(int) public abstract javax.transaction.xa.Xid[] javax.transaction.xa.XAResource.recover(int) throws javax.transaction.xa.XAException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_recover_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.XAResource#forget(javax.transaction.xa.Xid) public abstract void javax.transaction.xa.XAResource.forget(javax.transaction.xa.Xid) throws javax.transaction.xa.XAException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_forget_Xid() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.XAResource#setTransactionTimeout(int) public abstract boolean javax.transaction.xa.XAResource.setTransactionTimeout(int) throws javax.transaction.xa.XAException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTransactionTimeout_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.XAResource#start(javax.transaction.xa.Xid,int) public abstract void javax.transaction.xa.XAResource.start(javax.transaction.xa.Xid,int) throws javax.transaction.xa.XAException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_start_Xid_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.XAResource#commit(javax.transaction.xa.Xid,boolean) public abstract void javax.transaction.xa.XAResource.commit(javax.transaction.xa.Xid,boolean) throws javax.transaction.xa.XAException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_commit_Xid_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.XAResource#end(javax.transaction.xa.Xid,int) public abstract void javax.transaction.xa.XAResource.end(javax.transaction.xa.Xid,int) throws javax.transaction.xa.XAException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_end_Xid_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.transaction.xa.XAResource#isSameRM(javax.transaction.xa.XAResource) public abstract boolean javax.transaction.xa.XAResource.isSameRM(javax.transaction.xa.XAResource) throws javax.transaction.xa.XAException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSameRM_XAResource() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
