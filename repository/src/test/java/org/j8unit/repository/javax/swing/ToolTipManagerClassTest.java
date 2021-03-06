package org.j8unit.repository.javax.swing;

import javax.swing.ToolTipManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ToolTipManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.ToolTipManagerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ToolTipManagerClassTest
implements ToolTipManagerClassTests<ToolTipManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ToolTipManager]

    @Override
    public Class<ToolTipManager> createNewSUT() {
        return ToolTipManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.ToolTipManager#sharedInstance() public
     * static javax.swing.ToolTipManager javax.swing.ToolTipManager.sharedInstance()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_sharedInstance()
    throws Exception {
        // write some test for {@link javax.swing.ToolTipManager#sharedInstance()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.ToolTipManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ToolTipManager]

}
