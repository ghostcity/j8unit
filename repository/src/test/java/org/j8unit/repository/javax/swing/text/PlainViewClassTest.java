package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PlainViewClassTest
implements org.j8unit.repository.javax.swing.text.PlainViewClassTests<javax.swing.text.PlainView> {

    @Override
    public Class<javax.swing.text.PlainView> createNewSUT() {
        return javax.swing.text.PlainView.class;
    }

}