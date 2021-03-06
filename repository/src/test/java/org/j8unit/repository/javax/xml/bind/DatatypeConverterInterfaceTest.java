package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.DatatypeConverterInterface;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DatatypeConverterInterface} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.bind.DatatypeConverterInterfaceTests}).
 */
@RunWith(J8Unit4.class)
public class DatatypeConverterInterfaceTest
implements DatatypeConverterInterfaceTests<DatatypeConverterInterface> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.DatatypeConverterInterface]

    @Override
    public DatatypeConverterInterface createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.DatatypeConverterInterface], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.DatatypeConverterInterface]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.DatatypeConverterInterface]

}
