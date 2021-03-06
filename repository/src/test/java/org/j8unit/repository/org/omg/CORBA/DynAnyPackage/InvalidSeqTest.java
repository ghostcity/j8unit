package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.omg.CORBA.DynAnyPackage.InvalidSeq;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class InvalidSeqTest
implements FactoryBasedJ8UnitTest<InvalidSeq>, InvalidSeqTests<InvalidSeq> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.DynAnyPackage.InvalidSeq]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(InvalidSeq::new);
    }

    @Parameter(0)
    public Callable<InvalidSeq> sutFactory;

    @Override
    public Callable<InvalidSeq> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.DynAnyPackage.InvalidSeq]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.DynAnyPackage.InvalidSeq]

}
