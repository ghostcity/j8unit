package org.j8unit.repository.javax.script;

import javax.script.Bindings;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingsTest
implements org.j8unit.repository.javax.script.BindingsTests<Bindings> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.Bindings]

    @Override
    public Bindings createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.script.Bindings], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.script.Bindings]

}