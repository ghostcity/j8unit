package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.ULongSeqHelper;

@RunWith(J8Unit4.class)
public class ULongSeqHelperTest
implements org.j8unit.repository.org.omg.CORBA.ULongSeqHelperTests<ULongSeqHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ULongSeqHelper]

    @Override
    public ULongSeqHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.ULongSeqHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.ULongSeqHelper]

}