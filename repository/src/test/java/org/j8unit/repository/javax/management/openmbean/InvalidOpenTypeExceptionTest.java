package org.j8unit.repository.javax.management.openmbean;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.openmbean.InvalidOpenTypeException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InvalidOpenTypeExceptionTest
implements FactoryBasedJ8UnitTest<InvalidOpenTypeException>, InvalidOpenTypeExceptionTests<InvalidOpenTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.InvalidOpenTypeException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(InvalidOpenTypeException::new);
    }

    @Parameter(0)
    public Callable<InvalidOpenTypeException> sutFactory;

    @Override
    public Callable<InvalidOpenTypeException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.InvalidOpenTypeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.InvalidOpenTypeException]

}
