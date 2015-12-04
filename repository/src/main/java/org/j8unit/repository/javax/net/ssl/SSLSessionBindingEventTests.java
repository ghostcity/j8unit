package org.j8unit.repository.javax.net.ssl;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.net.ssl.SSLSessionBindingEvent class javax.net.ssl.SSLSessionBindingEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.net.ssl.SSLSessionBindingEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SSLSessionBindingEventTests<SUT extends javax.net.ssl.SSLSessionBindingEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSessionBindingEvent#getName() public java.lang.String javax.net.ssl.SSLSessionBindingEvent.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SSLSessionBindingEvent#getSession() public javax.net.ssl.SSLSession javax.net.ssl.SSLSessionBindingEvent.getSession()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSession() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
