package org.j8unit.repository.javax.xml.bind.helpers;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.bind.helpers.ValidationEventLocatorImpl;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ValidationEventLocatorImplTest
implements FactoryBasedJ8UnitTest<ValidationEventLocatorImpl>, ValidationEventLocatorImplTests<ValidationEventLocatorImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.helpers.ValidationEventLocatorImpl]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ValidationEventLocatorImpl::new);
    }

    @Parameter(0)
    public Callable<ValidationEventLocatorImpl> sutFactory;

    @Override
    public Callable<ValidationEventLocatorImpl> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.helpers.ValidationEventLocatorImpl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.helpers.ValidationEventLocatorImpl]

}
