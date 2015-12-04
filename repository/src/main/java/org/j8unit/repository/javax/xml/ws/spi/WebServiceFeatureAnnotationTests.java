package org.j8unit.repository.javax.xml.ws.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.ws.spi.WebServiceFeatureAnnotation interface javax.xml.ws.spi.WebServiceFeatureAnnotation},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.spi.WebServiceFeatureAnnotationClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface WebServiceFeatureAnnotationTests<SUT extends javax.xml.ws.spi.WebServiceFeatureAnnotation>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.WebServiceFeatureAnnotation#bean() public abstract java.lang.Class javax.xml.ws.spi.WebServiceFeatureAnnotation.bean()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_bean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.spi.WebServiceFeatureAnnotation#id() public abstract java.lang.String javax.xml.ws.spi.WebServiceFeatureAnnotation.id()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_id() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
