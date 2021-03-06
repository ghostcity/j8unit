package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.ListView;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ListView} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.html.ListViewClassTests}).
 */
@RunWith(J8Unit4.class)
public class ListViewClassTest
implements ListViewClassTests<ListView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.ListView]

    @Override
    public Class<ListView> createNewSUT() {
        return ListView.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.ListView#ListView(javax.swing.text.Element) public
     * javax.swing.text.html.ListView(javax.swing.text.Element)}.
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
    public void create_ListView_Element()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ListView sut = null; // = new ListView(javax.swing.text.Element);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.ListView]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.ListView]

}
