package org.j8unit.repository.java.time.temporal;

import java.time.temporal.IsoFields;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link IsoFields} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.IsoFieldsTests}).
 */
@RunWith(J8Unit4.class)
public class IsoFieldsTest
implements IsoFieldsTests<IsoFields> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.IsoFields]

    @Override
    public IsoFields createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.temporal.IsoFields], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.IsoFields]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.IsoFields]

}
