package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.Transformer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Transformer} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.TransformerTests}).
 */
@RunWith(J8Unit4.class)
public class TransformerTest
implements TransformerTests<Transformer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.Transformer]

    @Override
    public Transformer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.transform.Transformer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.Transformer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.Transformer]

}
