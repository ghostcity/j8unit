package org.j8unit.repository.javax.swing.plaf;

import static org.junit.Assert.fail;
import javax.swing.plaf.ViewportUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ViewportUI} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.plaf.ViewportUIClassTests}).
 */
@RunWith(J8Unit4.class)
public class ViewportUIClassTest
implements ViewportUIClassTests<ViewportUI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.ViewportUI]

    @Override
    public Class<ViewportUI> createNewSUT() {
        return ViewportUI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.plaf.ViewportUI#ViewportUI() public
     * javax.swing.plaf.ViewportUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_ViewportUI()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.ViewportUI]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.ViewportUI]

}
