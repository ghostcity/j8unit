package org.j8unit.repository.java.time.format;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.time.format.TextStyle;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TextStyle} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.format.TextStyleTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class TextStyleTest
implements TextStyleTests<TextStyle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.TextStyle]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(TextStyle.class);
    }

    @Parameter(0)
    public TextStyle sut;

    @Override
    public TextStyle createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.format.TextStyle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.format.TextStyle]

}
