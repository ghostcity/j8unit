package org.j8unit.repository.javax.swing.colorchooser;

import javax.swing.colorchooser.AbstractColorChooserPanel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractColorChooserPanelTest
implements org.j8unit.repository.javax.swing.colorchooser.AbstractColorChooserPanelTests<AbstractColorChooserPanel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.colorchooser.AbstractColorChooserPanel]

    @Override
    public AbstractColorChooserPanel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.colorchooser.AbstractColorChooserPanel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.colorchooser.AbstractColorChooserPanel]

}