package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleComponent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleComponent} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleComponentTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleComponentTest
implements AccessibleComponentTests<AccessibleComponent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleComponent]

    @Override
    public AccessibleComponent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleComponent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleComponent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleComponent]

}
