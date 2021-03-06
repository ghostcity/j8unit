package org.j8unit.repository.java.security.cert;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.PKIXRevocationChecker.Option;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PKIXRevocationChecker} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.cert.PKIXRevocationCheckerTests}).
 */
@RunWith(J8Unit4.class)
public class PKIXRevocationCheckerTest
implements PKIXRevocationCheckerTests<PKIXRevocationChecker> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXRevocationChecker]

    @Override
    public PKIXRevocationChecker createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.cert.PKIXRevocationChecker], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.PKIXRevocationChecker]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.PKIXRevocationChecker]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Option} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.security.cert.PKIXRevocationCheckerTests.OptionTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class OptionTest
    implements OptionTests<Option> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.cert.PKIXRevocationChecker$Option]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(Option.class);
        }

        @Parameter(0)
        public Option sut;

        @Override
        public Option createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.cert.PKIXRevocationChecker$Option]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.cert.PKIXRevocationChecker$Option]

    }

}
