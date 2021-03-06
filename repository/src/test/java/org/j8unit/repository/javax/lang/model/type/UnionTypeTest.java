package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.UnionType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnionType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.UnionTypeTests}).
 */
@RunWith(J8Unit4.class)
public class UnionTypeTest
implements UnionTypeTests<UnionType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.UnionType]

    @Override
    public UnionType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.type.UnionType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.UnionType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.UnionType]

}
