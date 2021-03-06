package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.ArrayType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ArrayType} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.lang.model.type.ArrayTypeClassTests}).
 */
@RunWith(J8Unit4.class)
public class ArrayTypeClassTest
implements ArrayTypeClassTests<ArrayType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.ArrayType]

    @Override
    public Class<ArrayType> createNewSUT() {
        return ArrayType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.ArrayType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.ArrayType]

}
