package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalComboBoxButton;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MetalComboBoxButton} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxButtonTests}).
 */
@RunWith(J8Unit4.class)
public class MetalComboBoxButtonTest
implements MetalComboBoxButtonTests<MetalComboBoxButton> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxButton]

    @Override
    public MetalComboBoxButton createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.metal.MetalComboBoxButton], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxButton]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalComboBoxButton]

}
