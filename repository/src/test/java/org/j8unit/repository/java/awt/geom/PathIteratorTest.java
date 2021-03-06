package org.j8unit.repository.java.awt.geom;

import java.awt.geom.PathIterator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PathIterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.geom.PathIteratorTests}).
 */
@RunWith(J8Unit4.class)
public class PathIteratorTest
implements PathIteratorTests<PathIterator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.geom.PathIterator]

    @Override
    public PathIterator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.geom.PathIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.geom.PathIterator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.geom.PathIterator]

}
