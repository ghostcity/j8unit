package org.j8unit.repository.org.omg.IOP;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.IOP.TaggedComponentHolder;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TaggedComponentHolderTest
implements FactoryBasedJ8UnitTest<TaggedComponentHolder>, TaggedComponentHolderTests<TaggedComponentHolder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TaggedComponentHolder]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(TaggedComponentHolder::new);
    }

    @Parameter(0)
    public Callable<TaggedComponentHolder> sutFactory;

    @Override
    public Callable<TaggedComponentHolder> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TaggedComponentHolder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TaggedComponentHolder]

}
