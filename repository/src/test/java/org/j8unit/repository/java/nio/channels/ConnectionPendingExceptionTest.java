package org.j8unit.repository.java.nio.channels;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.channels.ConnectionPendingException;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ConnectionPendingExceptionTest
implements FactoryBasedJ8UnitTest<ConnectionPendingException>, ConnectionPendingExceptionTests<ConnectionPendingException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.ConnectionPendingException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ConnectionPendingException::new);
    }

    @Parameter(0)
    public Callable<ConnectionPendingException> sutFactory;

    @Override
    public Callable<ConnectionPendingException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.ConnectionPendingException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.ConnectionPendingException]

}
