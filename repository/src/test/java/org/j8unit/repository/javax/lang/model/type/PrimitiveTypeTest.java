package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.PrimitiveType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrimitiveTypeTest
implements org.j8unit.repository.javax.lang.model.type.PrimitiveTypeTests<PrimitiveType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.PrimitiveType]

    @Override
    public PrimitiveType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.type.PrimitiveType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.PrimitiveType]

}