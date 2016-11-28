package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.FlavorTable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FlavorTable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.datatransfer.FlavorTableTests}).
 */
@RunWith(J8Unit4.class)
public class FlavorTableTest
implements FlavorTableTests<FlavorTable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.FlavorTable]

    @Override
    public FlavorTable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.datatransfer.FlavorTable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.datatransfer.FlavorTable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.datatransfer.FlavorTable]

}
