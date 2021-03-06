package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.MenuItemUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MenuItemUI} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.MenuItemUITests}).
 */
@RunWith(J8Unit4.class)
public class MenuItemUITest
implements MenuItemUITests<MenuItemUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.MenuItemUI]

    @Override
    public MenuItemUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.MenuItemUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.MenuItemUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.MenuItemUI]

}
