package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.Attribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeTest
implements org.j8unit.repository.javax.print.attribute.AttributeTests<Attribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.Attribute]

    @Override
    public Attribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.Attribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.Attribute]

}