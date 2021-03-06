package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.net.URLDecoder;
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
public class URLDecoderTest
implements FactoryBasedJ8UnitTest<URLDecoder>, URLDecoderTests<URLDecoder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URLDecoder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(URLDecoder::new);
    }

    @Parameter(0)
    public Callable<URLDecoder> sutFactory;

    @Override
    public Callable<URLDecoder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.URLDecoder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.URLDecoder]

}
