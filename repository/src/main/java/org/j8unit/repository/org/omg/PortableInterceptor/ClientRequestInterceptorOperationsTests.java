package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.PortableInterceptor.ClientRequestInterceptorOperations;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link ClientRequestInterceptorOperations public abstract interface
 * org.omg.PortableInterceptor.ClientRequestInterceptorOperations}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ClientRequestInterceptorOperationsClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClientRequestInterceptorOperationsTests<SUT extends ClientRequestInterceptorOperations>
extends InterceptorOperationsTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ClientRequestInterceptorOperations]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations#send_request(org.omg.PortableInterceptor.ClientRequestInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ClientRequestInterceptorOperations.send_request(org.omg.PortableInterceptor.ClientRequestInfo)
     * throws org.omg.PortableInterceptor.ForwardRequest}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_send_request_ClientRequestInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations#receive_other(org.omg.PortableInterceptor.ClientRequestInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ClientRequestInterceptorOperations.receive_other(org.omg.PortableInterceptor.ClientRequestInfo)
     * throws org.omg.PortableInterceptor.ForwardRequest}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_receive_other_ClientRequestInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations#receive_reply(org.omg.PortableInterceptor.ClientRequestInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ClientRequestInterceptorOperations.receive_reply(org.omg.PortableInterceptor.ClientRequestInfo)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_receive_reply_ClientRequestInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations#send_poll(org.omg.PortableInterceptor.ClientRequestInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ClientRequestInterceptorOperations.send_poll(org.omg.PortableInterceptor.ClientRequestInfo)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_send_poll_ClientRequestInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableInterceptor.ClientRequestInterceptorOperations#receive_exception(org.omg.PortableInterceptor.ClientRequestInfo)
     * public abstract void
     * org.omg.PortableInterceptor.ClientRequestInterceptorOperations.receive_exception(org.omg.PortableInterceptor.ClientRequestInfo)
     * throws org.omg.PortableInterceptor.ForwardRequest}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_receive_exception_ClientRequestInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableInterceptor.ClientRequestInterceptorOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableInterceptor.ClientRequestInterceptorOperations]

}
