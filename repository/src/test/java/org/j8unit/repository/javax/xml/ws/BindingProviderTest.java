package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.BindingProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingProviderTest
implements org.j8unit.repository.javax.xml.ws.BindingProviderTests<BindingProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.BindingProvider]

    @Override
    public BindingProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.BindingProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.BindingProvider]

}