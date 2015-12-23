package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.XMLValidateContext interface
 * javax.xml.crypto.dsig.XMLValidateContext}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.XMLValidateContextTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.crypto.dsig.XMLValidateContextClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.crypto.dsig.XMLValidateContext
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLValidateContextTests<SUT extends javax.xml.crypto.dsig.XMLValidateContext>
extends org.j8unit.repository.javax.xml.crypto.XMLCryptoContextTests<SUT> {

}
