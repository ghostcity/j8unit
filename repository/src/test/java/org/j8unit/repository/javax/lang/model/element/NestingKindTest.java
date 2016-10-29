package org.j8unit.repository.javax.lang.model.element;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.lang.model.element.NestingKind;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NestingKindTest
implements org.j8unit.repository.javax.lang.model.element.NestingKindTests<NestingKind> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.NestingKind]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOfEnumClass(NestingKind.class);
    }

    @Parameter(0)
    public NestingKind sut;

    @Override
    public NestingKind createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.NestingKind]

}
