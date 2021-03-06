package org.j8unit.repository.javax.sql;

import javax.sql.StatementEventListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StatementEventListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.sql.StatementEventListenerTests}).
 */
@RunWith(J8Unit4.class)
public class StatementEventListenerTest
implements StatementEventListenerTests<StatementEventListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.StatementEventListener]

    @Override
    public StatementEventListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.StatementEventListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.StatementEventListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.StatementEventListener]

}
