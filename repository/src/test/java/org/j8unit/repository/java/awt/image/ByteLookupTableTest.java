package org.j8unit.repository.java.awt.image;

import java.awt.image.ByteLookupTable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ByteLookupTable} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.ByteLookupTableTests}).
 */
@RunWith(J8Unit4.class)
public class ByteLookupTableTest
implements ByteLookupTableTests<ByteLookupTable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.ByteLookupTable]

    @Override
    public ByteLookupTable createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.ByteLookupTable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.ByteLookupTable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.ByteLookupTable]

}
