package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ErrorTest
implements org.j8unit.repository.java.lang.ErrorTests<java.lang.Error> {

    @Override
    public java.lang.Error createNewSUT() {
        return new java.lang.Error();
    }

}
