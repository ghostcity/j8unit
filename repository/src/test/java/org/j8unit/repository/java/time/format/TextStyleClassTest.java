package org.j8unit.repository.java.time.format;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextStyleClassTest
implements org.j8unit.repository.java.time.format.TextStyleClassTests<java.time.format.TextStyle> {

    @Override
    public Class<java.time.format.TextStyle> createNewSUT() {
        return java.time.format.TextStyle.class;
    }

}