package org.j8unit.repository.javax.management;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.InvalidAttributeValueException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InvalidAttributeValueExceptionTest
implements FactoryBasedJ8UnitTest<InvalidAttributeValueException>,
org.j8unit.repository.javax.management.InvalidAttributeValueExceptionTests<InvalidAttributeValueException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.InvalidAttributeValueException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(InvalidAttributeValueException::new);
    }

    @Parameter(0)
    public Callable<InvalidAttributeValueException> sutFactory;

    @Override
    public Callable<InvalidAttributeValueException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.InvalidAttributeValueException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.InvalidAttributeValueException]

}
