package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.ModelMBeanInfoSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ModelMBeanInfoSupport} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.modelmbean.ModelMBeanInfoSupportTests}).
 */
@RunWith(J8Unit4.class)
public class ModelMBeanInfoSupportTest
implements ModelMBeanInfoSupportTests<ModelMBeanInfoSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanInfoSupport]

    @Override
    public ModelMBeanInfoSupport createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.modelmbean.ModelMBeanInfoSupport], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanInfoSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.modelmbean.ModelMBeanInfoSupport]

}
