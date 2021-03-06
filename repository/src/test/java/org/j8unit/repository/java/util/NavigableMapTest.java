package org.j8unit.repository.java.util;

import java.util.NavigableMap;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NavigableMap} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.NavigableMapTests}).
 */
@RunWith(J8Unit4.class)
public class NavigableMapTest<K, V>
implements NavigableMapTests<NavigableMap<K, V>, K, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.NavigableMap]

    @Override
    public NavigableMap<K, V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.NavigableMap], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.NavigableMap]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.NavigableMap]

}
