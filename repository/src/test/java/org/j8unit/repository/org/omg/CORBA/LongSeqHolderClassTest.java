package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.LongSeqHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LongSeqHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.LongSeqHolderClassTests}).
 */
@RunWith(J8Unit4.class)
public class LongSeqHolderClassTest
implements LongSeqHolderClassTests<LongSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.LongSeqHolder]

    @Override
    public Class<LongSeqHolder> createNewSUT() {
        return LongSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.LongSeqHolder#LongSeqHolder(int[]) public org.omg.CORBA.LongSeqHolder(int[])}.
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
    public void create_LongSeqHolder_intArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LongSeqHolder sut = null; // = new LongSeqHolder(int[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.LongSeqHolder#LongSeqHolder()
     * public org.omg.CORBA.LongSeqHolder()}.
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
    public void create_LongSeqHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final LongSeqHolder sut = new LongSeqHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.LongSeqHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.LongSeqHolder]

}
