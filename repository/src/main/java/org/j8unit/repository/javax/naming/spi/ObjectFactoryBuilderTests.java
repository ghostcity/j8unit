package org.j8unit.repository.javax.naming.spi;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.spi.ObjectFactoryBuilder interface javax.naming.spi.ObjectFactoryBuilder},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.spi.ObjectFactoryBuilderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ObjectFactoryBuilderTests<SUT extends javax.naming.spi.ObjectFactoryBuilder>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.ObjectFactoryBuilder#createObjectFactory(java.lang.Object,java.util.Hashtable) public
     * abstract javax.naming.spi.ObjectFactory
     * javax.naming.spi.ObjectFactoryBuilder.createObjectFactory(java.lang.Object,java.util.Hashtable) throws
     * javax.naming.NamingException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createObjectFactory_Object_Hashtable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
