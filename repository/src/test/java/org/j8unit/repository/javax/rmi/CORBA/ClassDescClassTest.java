package org.j8unit.repository.javax.rmi.CORBA;

import javax.rmi.CORBA.ClassDesc;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClassDesc} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.rmi.CORBA.ClassDescClassTests}).
 */

@RunWith(J8Unit4.class)
public class ClassDescClassTest
implements ClassDescClassTests<ClassDesc> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.rmi.CORBA.ClassDesc]

    @Override
    public Class<ClassDesc> createNewSUT() {
        return ClassDesc.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.rmi.CORBA.ClassDesc#ClassDesc() public
     * javax.rmi.CORBA.ClassDesc()}.
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
    public void create_ClassDesc()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ClassDesc sut = new ClassDesc();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.rmi.CORBA.ClassDesc]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.rmi.CORBA.ClassDesc]

}
