package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.PDLOverrideSupported;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PDLOverrideSupportedTest
implements org.j8unit.repository.javax.print.attribute.standard.PDLOverrideSupportedTests<PDLOverrideSupported> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PDLOverrideSupported]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PDLOverrideSupported.NOT_ATTEMPTED, //
                                PDLOverrideSupported.ATTEMPTED);
    }

    @Parameter(0)
    public PDLOverrideSupported sut;

    @Override
    public PDLOverrideSupported createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PDLOverrideSupported]

}
