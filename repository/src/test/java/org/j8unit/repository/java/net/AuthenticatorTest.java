package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Authenticator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.AuthenticatorTests}).
 */
@RunWith(J8Unit4.class)
public class AuthenticatorTest
implements AuthenticatorTests<Authenticator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.Authenticator]

    @Override
    public Authenticator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.Authenticator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.Authenticator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.Authenticator]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link RequestorType} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.java.net.AuthenticatorTests.RequestorTypeTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class RequestorTypeTest
    implements RequestorTypeTests<RequestorType> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.Authenticator$RequestorType]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(RequestorType.class);
        }

        @Parameter(0)
        public RequestorType sut;

        @Override
        public RequestorType createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.Authenticator$RequestorType]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.Authenticator$RequestorType]

    }

}
