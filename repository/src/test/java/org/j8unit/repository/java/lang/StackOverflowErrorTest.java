package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StackOverflowErrorTest
implements org.j8unit.repository.java.lang.StackOverflowErrorTests<java.lang.StackOverflowError> {

    @Override
    public java.lang.StackOverflowError createNewSUT() {
        return new java.lang.StackOverflowError();
    }

}