package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeNotPresentExceptionTest
implements org.j8unit.repository.java.lang.TypeNotPresentExceptionTests<java.lang.TypeNotPresentException> {

    @Override
    public java.lang.TypeNotPresentException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.TypeNotPresentException] available.");
    }

}