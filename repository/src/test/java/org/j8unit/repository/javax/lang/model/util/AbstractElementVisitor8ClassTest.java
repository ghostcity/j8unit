package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.AbstractElementVisitor8;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractElementVisitor8} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.lang.model.util.AbstractElementVisitor8ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractElementVisitor8ClassTest
implements AbstractElementVisitor8ClassTests<AbstractElementVisitor8> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.AbstractElementVisitor8]

    @Override
    public Class<AbstractElementVisitor8> createNewSUT() {
        return AbstractElementVisitor8.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.AbstractElementVisitor8]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.AbstractElementVisitor8]

}
