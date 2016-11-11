package org.j8unit.repository.java.beans;

import java.beans.Expression;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Expression} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.beans.ExpressionTests}).
 */

@RunWith(J8Unit4.class)
public class ExpressionTest
implements ExpressionTests<Expression> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Expression]

    @Override
    public Expression createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.Expression], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.Expression]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.Expression]

}
