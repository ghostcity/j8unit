package org.j8unit.repository.javax.management;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.AttributeChangeNotificationFilter;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AttributeChangeNotificationFilterTest
implements FactoryBasedJ8UnitTest<AttributeChangeNotificationFilter>, AttributeChangeNotificationFilterTests<AttributeChangeNotificationFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.AttributeChangeNotificationFilter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(AttributeChangeNotificationFilter::new);
    }

    @Parameter(0)
    public Callable<AttributeChangeNotificationFilter> sutFactory;

    @Override
    public Callable<AttributeChangeNotificationFilter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.AttributeChangeNotificationFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.AttributeChangeNotificationFilter]

}
