package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ObjectReferenceFactory;

@RunWith(J8Unit4.class)
public class ObjectReferenceFactoryTest
implements org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceFactoryTests<ObjectReferenceFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ObjectReferenceFactory]

    @Override
    public ObjectReferenceFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.ObjectReferenceFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.ObjectReferenceFactory]

}