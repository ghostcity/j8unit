package org.j8unit.repository.javax.jws;

import javax.jws.WebResult;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WebResult} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.jws.WebResultTests}).
 */
@RunWith(J8Unit4.class)
public class WebResultTest
implements WebResultTests<WebResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.WebResult]

    @Override
    public WebResult createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.WebResult], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.WebResult]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.WebResult]

}
