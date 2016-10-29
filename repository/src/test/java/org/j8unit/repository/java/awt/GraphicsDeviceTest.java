package org.j8unit.repository.java.awt;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.awt.GraphicsDevice;
import java.awt.GraphicsDevice.WindowTranslucency;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class GraphicsDeviceTest
implements org.j8unit.repository.java.awt.GraphicsDeviceTests<GraphicsDevice> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GraphicsDevice]

    @Override
    public GraphicsDevice createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.GraphicsDevice], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GraphicsDevice]

    @RunWith(J8Unit4.class)
    public static class WindowTranslucencyTest
    implements org.j8unit.repository.java.awt.GraphicsDeviceTests.WindowTranslucencyTests<WindowTranslucency> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GraphicsDevice$WindowTranslucency]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(WindowTranslucency.class);
        }

        @Parameter(0)
        public WindowTranslucency sut;

        @Override
        public WindowTranslucency createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GraphicsDevice$WindowTranslucency]

    }

}