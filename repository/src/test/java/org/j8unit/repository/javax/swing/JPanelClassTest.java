package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JPanelClassTest
implements org.j8unit.repository.javax.swing.JPanelClassTests<javax.swing.JPanel> {

    @Override
    public Class<javax.swing.JPanel> createNewSUT() {
        return javax.swing.JPanel.class;
    }

}