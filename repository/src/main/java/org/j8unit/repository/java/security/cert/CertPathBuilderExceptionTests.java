package org.j8unit.repository.java.security.cert;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.security.cert.CertPathBuilderException class
 * java.security.cert.CertPathBuilderException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.security.cert.CertPathBuilderExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.security.cert.CertPathBuilderExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.security.cert.CertPathBuilderException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CertPathBuilderExceptionTests<SUT extends java.security.cert.CertPathBuilderException>
extends org.j8unit.repository.java.security.GeneralSecurityExceptionTests<SUT> {

}
