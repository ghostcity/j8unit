package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationTypeTest
implements org.j8unit.repository.javax.management.relation.RelationTypeTests<RelationType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.RelationType]

    @Override
    public RelationType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.relation.RelationType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.RelationType]

}