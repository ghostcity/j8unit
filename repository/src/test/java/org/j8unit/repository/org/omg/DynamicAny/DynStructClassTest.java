package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynStruct;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynStruct} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynStructClassTests}).
 */
@RunWith(J8Unit4.class)
public class DynStructClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynStructClassTests<DynStruct> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynStruct]

    @Override
    public Class<DynStruct> createNewSUT() {
        return DynStruct.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynStruct]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynStruct]

}
