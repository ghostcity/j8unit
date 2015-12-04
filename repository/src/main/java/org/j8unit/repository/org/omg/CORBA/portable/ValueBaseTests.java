package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.portable.ValueBase interface org.omg.CORBA.portable.ValueBase},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA.portable.ValueBaseClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ValueBaseTests<SUT extends org.omg.CORBA.portable.ValueBase>
extends org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ValueBase#_truncatable_ids() public abstract java.lang.String[] org.omg.CORBA.portable.ValueBase._truncatable_ids()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__truncatable_ids() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
