package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.Element;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ElementTest
implements org.j8unit.repository.javax.lang.model.element.ElementTests<Element> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.Element]

    @Override
    public Element createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.element.Element], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.Element]

}