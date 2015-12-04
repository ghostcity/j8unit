package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.HTMLWriter class javax.swing.text.html.HTMLWriter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.HTMLWriterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HTMLWriterTests<SUT extends javax.swing.text.html.HTMLWriter>
extends org.j8unit.repository.javax.swing.text.AbstractWriterTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.HTMLWriter#write() public void javax.swing.text.html.HTMLWriter.write() throws java.io.IOException,javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_write() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
