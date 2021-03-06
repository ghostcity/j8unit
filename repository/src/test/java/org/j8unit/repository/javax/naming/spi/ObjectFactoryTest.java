package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.ObjectFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ObjectFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.spi.ObjectFactoryTests}).
 */
@RunWith(J8Unit4.class)
public class ObjectFactoryTest
implements ObjectFactoryTests<ObjectFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.ObjectFactory]

    @Override
    public ObjectFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.spi.ObjectFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.ObjectFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.ObjectFactory]

}
