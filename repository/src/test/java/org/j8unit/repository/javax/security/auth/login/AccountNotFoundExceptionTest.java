package org.j8unit.repository.javax.security.auth.login;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.security.auth.login.AccountNotFoundException;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AccountNotFoundExceptionTest
implements FactoryBasedJ8UnitTest<AccountNotFoundException>, AccountNotFoundExceptionTests<AccountNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.login.AccountNotFoundException]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(AccountNotFoundException::new);
    }

    @Parameter(0)
    public Callable<AccountNotFoundException> sutFactory;

    @Override
    public Callable<AccountNotFoundException> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.login.AccountNotFoundException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.login.AccountNotFoundException]

}
