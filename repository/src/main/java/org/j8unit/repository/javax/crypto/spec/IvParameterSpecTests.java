package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.crypto.spec.IvParameterSpec class javax.crypto.spec.IvParameterSpec},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.crypto.spec.IvParameterSpecClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IvParameterSpecTests<SUT extends javax.crypto.spec.IvParameterSpec>
extends org.j8unit.repository.java.security.spec.AlgorithmParameterSpecTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.IvParameterSpec#getIV() public byte[] javax.crypto.spec.IvParameterSpec.getIV()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIV() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
