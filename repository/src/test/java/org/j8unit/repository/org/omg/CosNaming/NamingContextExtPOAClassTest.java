package org.j8unit.repository.org.omg.CosNaming;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextExtPOA;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamingContextExtPOA} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NamingContextExtPOAClassTests}).
 */
@RunWith(J8Unit4.class)
public class NamingContextExtPOAClassTest
implements NamingContextExtPOAClassTests<NamingContextExtPOA> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextExtPOA]

    @Override
    public Class<NamingContextExtPOA> createNewSUT() {
        return NamingContextExtPOA.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextExtPOA#NamingContextExtPOA() public
     * org.omg.CosNaming.NamingContextExtPOA()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_NamingContextExtPOA()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextExtPOA]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextExtPOA]

}
