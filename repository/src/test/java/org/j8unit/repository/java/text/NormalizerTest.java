package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Normalizer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.NormalizerTests}).
 */
@RunWith(J8Unit4.class)
public class NormalizerTest
implements NormalizerTests<Normalizer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Normalizer]

    @Override
    public Normalizer createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.Normalizer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.Normalizer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.Normalizer]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Form} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.text.NormalizerTests.FormTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FormTest
    implements FormTests<Form> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Normalizer$Form]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOfEnumClass(Form.class);
        }

        @Parameter(0)
        public Form sut;

        @Override
        public Form createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.Normalizer$Form]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.Normalizer$Form]

    }

}
