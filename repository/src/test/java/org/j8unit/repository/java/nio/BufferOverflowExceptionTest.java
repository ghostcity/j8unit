package org.j8unit.repository.java.nio;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.nio.BufferOverflowException;
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
public class BufferOverflowExceptionTest
implements FactoryBasedJ8UnitTest<BufferOverflowException>, BufferOverflowExceptionTests<BufferOverflowException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.BufferOverflowException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(BufferOverflowException::new);
    }

    @Parameter(0)
    public Callable<BufferOverflowException> sutFactory;

    @Override
    public Callable<BufferOverflowException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.BufferOverflowException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.BufferOverflowException]

}
