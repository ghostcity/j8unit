package org.j8unit.repository.java.security.spec;

import java.security.spec.EllipticCurve;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EllipticCurve} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.spec.EllipticCurveClassTests}).
 */
@RunWith(J8Unit4.class)
public class EllipticCurveClassTest
implements EllipticCurveClassTests<EllipticCurve> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.EllipticCurve]

    @Override
    public Class<EllipticCurve> createNewSUT() {
        return EllipticCurve.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.EllipticCurve#EllipticCurve(java.security.spec.ECField, java.math.BigInteger, java.math.BigInteger)
     * public java.security.spec.EllipticCurve(java.security.spec.ECField,java.math.BigInteger,java.math.BigInteger)}.
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
    public void create_EllipticCurve_ECField_BigInteger_BigInteger()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EllipticCurve sut = null; // = new EllipticCurve(java.security.spec.ECField, java.math.BigInteger,
                                        // java.math.BigInteger);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.EllipticCurve#EllipticCurve(java.security.spec.ECField, java.math.BigInteger, java.math.BigInteger, byte[])
     * public
     * java.security.spec.EllipticCurve(java.security.spec.ECField,java.math.BigInteger,java.math.BigInteger,byte[])}.
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
    public void create_EllipticCurve_ECField_BigInteger_BigInteger_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EllipticCurve sut = null; // = new EllipticCurve(java.security.spec.ECField, java.math.BigInteger,
                                        // java.math.BigInteger, byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.EllipticCurve]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.EllipticCurve]

}
