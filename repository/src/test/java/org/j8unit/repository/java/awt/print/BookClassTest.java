package org.j8unit.repository.java.awt.print;

import java.awt.print.Book;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Book} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.awt.print.BookClassTests}).
 */
@RunWith(J8Unit4.class)
public class BookClassTest
implements BookClassTests<Book> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.print.Book]

    @Override
    public Class<Book> createNewSUT() {
        return Book.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.print.Book#Book() public
     * java.awt.print.Book()}.
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
    public void create_Book()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Book sut = new Book();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.print.Book]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.print.Book]

}
