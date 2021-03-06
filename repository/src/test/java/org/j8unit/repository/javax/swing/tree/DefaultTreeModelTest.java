package org.j8unit.repository.javax.swing.tree;

import javax.swing.tree.DefaultTreeModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DefaultTreeModel} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.tree.DefaultTreeModelTests}).
 */
@RunWith(J8Unit4.class)
public class DefaultTreeModelTest
implements DefaultTreeModelTests<DefaultTreeModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.tree.DefaultTreeModel]

    @Override
    public DefaultTreeModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.tree.DefaultTreeModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.tree.DefaultTreeModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.tree.DefaultTreeModel]

}
