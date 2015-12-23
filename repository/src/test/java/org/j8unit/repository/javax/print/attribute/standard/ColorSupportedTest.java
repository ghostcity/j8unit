package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ColorSupportedTest
implements org.j8unit.repository.javax.print.attribute.standard.ColorSupportedTests<javax.print.attribute.standard.ColorSupported> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.ColorSupported.SUPPORTED, //
                                javax.print.attribute.standard.ColorSupported.NOT_SUPPORTED);
    }

    @Parameter(0)
    public javax.print.attribute.standard.ColorSupported sut;

    @Override
    public javax.print.attribute.standard.ColorSupported createNewSUT() {
        return this.sut;
    }

}
