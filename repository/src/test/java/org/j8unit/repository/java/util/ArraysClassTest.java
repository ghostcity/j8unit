package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArraysClassTest
implements org.j8unit.repository.java.util.ArraysClassTests<java.util.Arrays> {

    @Override
    public Class<java.util.Arrays> createNewSUT() {
        return java.util.Arrays.class;
    }

}