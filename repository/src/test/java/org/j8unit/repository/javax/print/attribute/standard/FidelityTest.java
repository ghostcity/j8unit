package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.Fidelity;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class FidelityTest
implements org.j8unit.repository.javax.print.attribute.standard.FidelityTests<Fidelity> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.Fidelity]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(Fidelity.FIDELITY_FALSE, //
                                Fidelity.FIDELITY_TRUE);
    }

    @Parameter(0)
    public Fidelity sut;

    @Override
    public Fidelity createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.Fidelity]

}
