package org.j8unit.repository.java.net;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ProxyTest
implements org.j8unit.repository.java.net.ProxyTests<java.net.Proxy> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.net.Proxy.NO_PROXY);
    }

    @Parameter(0)
    public java.net.Proxy sut;

    @Override
    public java.net.Proxy createNewSUT() {
        return this.sut;
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TypeTest
    implements org.j8unit.repository.java.net.ProxyTests.TypeTests<java.net.Proxy.Type> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(java.net.Proxy.Type.class);
        }

        @Parameter(0)
        public java.net.Proxy.Type sut;

        @Override
        public java.net.Proxy.Type createNewSUT() {
            return this.sut;
        }

    }

}
