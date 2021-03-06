package org.j8unit.repository.java.lang.management;

import java.lang.management.MemoryMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MemoryMXBean} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.management.MemoryMXBeanClassTests}).
 */
@RunWith(J8Unit4.class)
public class MemoryMXBeanClassTest
implements MemoryMXBeanClassTests<MemoryMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.MemoryMXBean]

    @Override
    public Class<MemoryMXBean> createNewSUT() {
        return MemoryMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.MemoryMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.MemoryMXBean]

}
