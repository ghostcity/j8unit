package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.DynamicAny._DynFixedStub;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link _DynFixedStub} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny._DynFixedStubClassTests}).
 */
@RunWith(J8Unit4.class)
public class _DynFixedStubClassTest
implements _DynFixedStubClassTests<_DynFixedStub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny._DynFixedStub]

    @Override
    public Class<_DynFixedStub> createNewSUT() {
        return _DynFixedStub.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.DynamicAny._DynFixedStub#_DynFixedStub() public org.omg.DynamicAny._DynFixedStub()}.
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
    public void create__DynFixedStub()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final _DynFixedStub sut = new _DynFixedStub();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny._DynFixedStub]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny._DynFixedStub]

}
