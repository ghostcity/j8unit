package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.Transform interface javax.xml.crypto.dsig.Transform},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.TransformClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TransformTests<SUT extends javax.xml.crypto.dsig.Transform>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>,
        org.j8unit.repository.javax.xml.crypto.AlgorithmMethodTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.Transform#getParameterSpec() public abstract java.security.spec.AlgorithmParameterSpec javax.xml.crypto.dsig.Transform.getParameterSpec()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getParameterSpec() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.Transform#transform(javax.xml.crypto.Data,javax.xml.crypto.XMLCryptoContext) public abstract javax.xml.crypto.Data javax.xml.crypto.dsig.Transform.transform(javax.xml.crypto.Data,javax.xml.crypto.XMLCryptoContext) throws javax.xml.crypto.dsig.TransformException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_Data_XMLCryptoContext() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.Transform#transform(javax.xml.crypto.Data,javax.xml.crypto.XMLCryptoContext,java.io.OutputStream) public abstract javax.xml.crypto.Data javax.xml.crypto.dsig.Transform.transform(javax.xml.crypto.Data,javax.xml.crypto.XMLCryptoContext,java.io.OutputStream) throws javax.xml.crypto.dsig.TransformException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_Data_XMLCryptoContext_OutputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
