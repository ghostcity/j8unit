package org.j8unit.repository.javax.naming.directory;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.naming.directory.AttributeModificationException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AttributeModificationExceptionTest
implements FactoryBasedJ8UnitTest<AttributeModificationException>, AttributeModificationExceptionTests<AttributeModificationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.directory.AttributeModificationException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(AttributeModificationException::new);
    }

    @Parameter(0)
    public Callable<AttributeModificationException> sutFactory;

    @Override
    public Callable<AttributeModificationException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.directory.AttributeModificationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.directory.AttributeModificationException]

}
