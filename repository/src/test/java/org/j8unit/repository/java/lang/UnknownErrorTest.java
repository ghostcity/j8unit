package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownErrorTest
implements org.j8unit.repository.java.lang.UnknownErrorTests<java.lang.UnknownError> {

    @Override
    public java.lang.UnknownError createNewSUT() {
        return new java.lang.UnknownError();
    }

}