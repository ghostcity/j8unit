package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.UnionMemberHelper;

@RunWith(J8Unit4.class)
public class UnionMemberHelperTest
implements org.j8unit.repository.org.omg.CORBA.UnionMemberHelperTests<UnionMemberHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.UnionMemberHelper]

    @Override
    public UnionMemberHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.UnionMemberHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.UnionMemberHelper]

}