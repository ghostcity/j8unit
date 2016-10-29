package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class XmlJavaTypeAdapterTest
implements org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapterTests<XmlJavaTypeAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter]

    @Override
    public XmlJavaTypeAdapter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class DEFAULTTest
    implements FactoryBasedJ8UnitTest<DEFAULT>, org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapterTests.DEFAULTTests<DEFAULT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter$DEFAULT]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(DEFAULT::new);
        }

        @Parameter(0)
        public Callable<DEFAULT> sutFactory;

        @Override
        public Callable<DEFAULT> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter$DEFAULT]

    }

}