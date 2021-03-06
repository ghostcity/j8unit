package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.RC5ParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RC5ParameterSpec} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.RC5ParameterSpecTests}).
 */
@RunWith(J8Unit4.class)
public class RC5ParameterSpecTest
implements RC5ParameterSpecTests<RC5ParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.RC5ParameterSpec]

    @Override
    public RC5ParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.spec.RC5ParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.RC5ParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.RC5ParameterSpec]

}
