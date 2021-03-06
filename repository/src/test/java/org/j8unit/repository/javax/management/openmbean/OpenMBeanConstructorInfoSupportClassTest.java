package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanConstructorInfoSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OpenMBeanConstructorInfoSupport} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanConstructorInfoSupportClassTests}).
 */
@RunWith(J8Unit4.class)
public class OpenMBeanConstructorInfoSupportClassTest
implements OpenMBeanConstructorInfoSupportClassTests<OpenMBeanConstructorInfoSupport> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.OpenMBeanConstructorInfoSupport]

    @Override
    public Class<OpenMBeanConstructorInfoSupport> createNewSUT() {
        return OpenMBeanConstructorInfoSupport.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#OpenMBeanConstructorInfoSupport(String, String, javax.management.openmbean.OpenMBeanParameterInfo[])
     * public
     * javax.management.openmbean.OpenMBeanConstructorInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanParameterInfo[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_OpenMBeanConstructorInfoSupport_String_String_OpenMBeanParameterInfoArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OpenMBeanConstructorInfoSupport sut = null; // = new OpenMBeanConstructorInfoSupport(String, String,
                                                          // javax.management.openmbean.OpenMBeanParameterInfo[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#OpenMBeanConstructorInfoSupport(String, String, javax.management.openmbean.OpenMBeanParameterInfo[], javax.management.Descriptor)
     * public
     * javax.management.openmbean.OpenMBeanConstructorInfoSupport(java.lang.String,java.lang.String,javax.management.openmbean.OpenMBeanParameterInfo[],javax.management.Descriptor)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_OpenMBeanConstructorInfoSupport_String_String_OpenMBeanParameterInfoArray_Descriptor()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OpenMBeanConstructorInfoSupport sut = null; // = new OpenMBeanConstructorInfoSupport(String, String,
                                                          // javax.management.openmbean.OpenMBeanParameterInfo[],
                                                          // javax.management.Descriptor);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.OpenMBeanConstructorInfoSupport]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.OpenMBeanConstructorInfoSupport]

}
