package org.j8unit.repository.javax.crypto.spec;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class OAEPParameterSpecTest
implements org.j8unit.repository.javax.crypto.spec.OAEPParameterSpecTests<javax.crypto.spec.OAEPParameterSpec> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.crypto.spec.OAEPParameterSpec.DEFAULT);
    }

    @Parameter(0)
    public javax.crypto.spec.OAEPParameterSpec sut;

    @Override
    public javax.crypto.spec.OAEPParameterSpec createNewSUT() {
        return this.sut;
    }

}
