package org.j8unit.repository.org.xml.sax;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.xml.sax.InputSource;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InputSourceTest
implements FactoryBasedJ8UnitTest<InputSource>, InputSourceTests<InputSource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.InputSource]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(InputSource::new);
    }

    @Parameter(0)
    public Callable<InputSource> sutFactory;

    @Override
    public Callable<InputSource> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.InputSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.InputSource]

}
