package org.j8unit.repository.javax.xml.ws.spi;

import javax.xml.ws.spi.Invoker;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvokerTest
implements org.j8unit.repository.javax.xml.ws.spi.InvokerTests<Invoker> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.spi.Invoker]

    @Override
    public Invoker createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.spi.Invoker], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.spi.Invoker]

}