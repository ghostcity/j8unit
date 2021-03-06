package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.Predicate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Predicate} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.PredicateTests}).
 */
@RunWith(J8Unit4.class)
public class PredicateTest
implements PredicateTests<Predicate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.Predicate]

    @Override
    public Predicate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.Predicate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.Predicate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.Predicate]

}
