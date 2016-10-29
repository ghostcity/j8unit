package org.j8unit.repository.javax.tools;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.tools.Diagnostic;
import javax.tools.Diagnostic.Kind;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class DiagnosticTest<S>
implements org.j8unit.repository.javax.tools.DiagnosticTests<Diagnostic<S>, S> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.Diagnostic]

    @Override
    public Diagnostic<S> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.Diagnostic], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.Diagnostic]

    @RunWith(J8Unit4.class)
    public static class KindTest
    implements org.j8unit.repository.javax.tools.DiagnosticTests.KindTests<Kind> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.Diagnostic$Kind]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(Kind.class);
        }

        @Parameter(0)
        public Kind sut;

        @Override
        public Kind createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.Diagnostic$Kind]

    }

}