package org.j8unit.repository.javax.security.auth;

import javax.security.auth.Destroyable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DestroyableTest
implements org.j8unit.repository.javax.security.auth.DestroyableTests<Destroyable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.Destroyable]

    @Override
    public Destroyable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.auth.Destroyable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.Destroyable]

}