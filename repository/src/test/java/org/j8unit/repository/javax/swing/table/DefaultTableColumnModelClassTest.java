package org.j8unit.repository.javax.swing.table;

import javax.swing.table.DefaultTableColumnModel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultTableColumnModel} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.table.DefaultTableColumnModelClassTests}).
 */
@RunWith(J8Unit4.class)
public class DefaultTableColumnModelClassTest
implements DefaultTableColumnModelClassTests<DefaultTableColumnModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.table.DefaultTableColumnModel]

    @Override
    public Class<DefaultTableColumnModel> createNewSUT() {
        return DefaultTableColumnModel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.table.DefaultTableColumnModel#DefaultTableColumnModel() public
     * javax.swing.table.DefaultTableColumnModel()}.
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
    public void create_DefaultTableColumnModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DefaultTableColumnModel sut = new DefaultTableColumnModel();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.table.DefaultTableColumnModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.table.DefaultTableColumnModel]

}
