package org.j8unit.repository.javax.swing;

import javax.swing.ButtonModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ButtonModelTest
implements org.j8unit.repository.javax.swing.ButtonModelTests<ButtonModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ButtonModel]

    @Override
    public ButtonModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.ButtonModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ButtonModel]

}