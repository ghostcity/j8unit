package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.IOP.Encoding;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Encoding} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.IOP.EncodingClassTests}).
 */
@RunWith(J8Unit4.class)
public class EncodingClassTest
implements EncodingClassTests<Encoding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.Encoding]

    @Override
    public Class<Encoding> createNewSUT() {
        return Encoding.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.IOP.Encoding#Encoding() public
     * org.omg.IOP.Encoding()}.
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
    public void create_Encoding()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Encoding sut = new Encoding();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.IOP.Encoding#Encoding(short, byte, byte) public org.omg.IOP.Encoding(short,byte,byte)}.
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
    public void create_Encoding_short_byte_byte()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Encoding sut = null; // = new Encoding(short, byte, byte);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.Encoding]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.Encoding]

}
