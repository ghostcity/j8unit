package org.j8unit.repository.javax.swing;

import static org.junit.Assert.fail;
import javax.swing.AbstractAction;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractAction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.AbstractActionClassTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractActionClassTest
implements AbstractActionClassTests<AbstractAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.AbstractAction]

    @Override
    public Class<AbstractAction> createNewSUT() {
        return AbstractAction.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.AbstractAction#AbstractAction(String) public javax.swing.AbstractAction(java.lang.String)}.
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
    public void create_AbstractAction_String()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.AbstractAction#AbstractAction()
     * public javax.swing.AbstractAction()}.
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
    public void create_AbstractAction()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.AbstractAction#AbstractAction(String, javax.swing.Icon) public
     * javax.swing.AbstractAction(java.lang.String,javax.swing.Icon)}.
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
    public void create_AbstractAction_String_Icon()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.AbstractAction]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.AbstractAction]

}
