package org.j8unit.repository.java.util;

import java.util.PropertyPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PropertyPermission} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.PropertyPermissionTests}).
 */
@RunWith(J8Unit4.class)
public class PropertyPermissionTest
implements PropertyPermissionTests<PropertyPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.PropertyPermission]

    @Override
    public PropertyPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.PropertyPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.PropertyPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.PropertyPermission]

}
