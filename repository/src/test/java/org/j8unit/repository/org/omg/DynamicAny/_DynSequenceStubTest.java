package org.j8unit.repository.org.omg.DynamicAny;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.DynamicAny._DynSequenceStub;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class _DynSequenceStubTest
implements FactoryBasedJ8UnitTest<_DynSequenceStub>, _DynSequenceStubTests<_DynSequenceStub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny._DynSequenceStub]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(_DynSequenceStub::new);
    }

    @Parameter(0)
    public Callable<_DynSequenceStub> sutFactory;

    @Override
    public Callable<_DynSequenceStub> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny._DynSequenceStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny._DynSequenceStub]

}
