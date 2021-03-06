package org.j8unit.repository.java.security;

import java.security.SecurityPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SecurityPermission} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.SecurityPermissionTests}).
 */
@RunWith(J8Unit4.class)
public class SecurityPermissionTest
implements SecurityPermissionTests<SecurityPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.SecurityPermission]

    @Override
    public SecurityPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.SecurityPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.SecurityPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.SecurityPermission]

}
