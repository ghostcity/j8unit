package org.j8unit.repository.java.rmi;

import java.rmi.ServerRuntimeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerRuntimeExceptionClassTest
implements org.j8unit.repository.java.rmi.ServerRuntimeExceptionClassTests<ServerRuntimeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.ServerRuntimeException]

    @Override
    public Class<ServerRuntimeException> createNewSUT() {
        return ServerRuntimeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.ServerRuntimeException#ServerRuntimeException(String, Exception) public
     * java.rmi.ServerRuntimeException(java.lang.String,java.lang.Exception)}.
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
    public void create_ServerRuntimeException_String_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServerRuntimeException sut = null; // = new ServerRuntimeException(String, Exception);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.ServerRuntimeException]

}
