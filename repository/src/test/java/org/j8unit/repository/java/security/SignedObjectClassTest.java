package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignedObjectClassTest
implements org.j8unit.repository.java.security.SignedObjectClassTests<java.security.SignedObject> {

    @Override
    public Class<java.security.SignedObject> createNewSUT() {
        return java.security.SignedObject.class;
    }

}