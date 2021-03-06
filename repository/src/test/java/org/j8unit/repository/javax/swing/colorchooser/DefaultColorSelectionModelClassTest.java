package org.j8unit.repository.javax.swing.colorchooser;

import javax.swing.colorchooser.DefaultColorSelectionModel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultColorSelectionModel} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.swing.colorchooser.DefaultColorSelectionModelClassTests}).
 */
@RunWith(J8Unit4.class)
public class DefaultColorSelectionModelClassTest
implements DefaultColorSelectionModelClassTests<DefaultColorSelectionModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.colorchooser.DefaultColorSelectionModel]

    @Override
    public Class<DefaultColorSelectionModel> createNewSUT() {
        return DefaultColorSelectionModel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.colorchooser.DefaultColorSelectionModel#DefaultColorSelectionModel(java.awt.Color) public
     * javax.swing.colorchooser.DefaultColorSelectionModel(java.awt.Color)}.
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
    public void create_DefaultColorSelectionModel_Color()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DefaultColorSelectionModel sut = null; // = new DefaultColorSelectionModel(java.awt.Color);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.colorchooser.DefaultColorSelectionModel#DefaultColorSelectionModel() public
     * javax.swing.colorchooser.DefaultColorSelectionModel()}.
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
    public void create_DefaultColorSelectionModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DefaultColorSelectionModel sut = new DefaultColorSelectionModel();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.colorchooser.DefaultColorSelectionModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.colorchooser.DefaultColorSelectionModel]

}
