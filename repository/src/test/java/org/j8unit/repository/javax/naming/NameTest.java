package org.j8unit.repository.javax.naming;

import javax.naming.Name;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameTest
implements org.j8unit.repository.javax.naming.NameTests<Name> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.Name]

    @Override
    public Name createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.Name], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.Name]

}