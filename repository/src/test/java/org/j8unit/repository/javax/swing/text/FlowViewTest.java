package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.FlowView;
import javax.swing.text.FlowView.FlowStrategy;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FlowView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.FlowViewTests}).
 */
@RunWith(J8Unit4.class)
public class FlowViewTest
implements FlowViewTests<FlowView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.FlowView]

    @Override
    public FlowView createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.FlowView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.FlowView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.FlowView]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FlowStrategyTest
    implements FactoryBasedJ8UnitTest<FlowStrategy>, FlowStrategyTests<FlowStrategy> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.FlowView$FlowStrategy]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(FlowStrategy::new);
        }

        @Parameter(0)
        public Callable<FlowStrategy> sutFactory;

        @Override
        public Callable<FlowStrategy> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.FlowView$FlowStrategy]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.FlowView$FlowStrategy]

    }

}
