package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.w3c.dom.ls.LSProgressEvent interface org.w3c.dom.ls.LSProgressEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.w3c.dom.ls.LSProgressEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LSProgressEventTests<SUT extends org.w3c.dom.ls.LSProgressEvent>
extends org.j8unit.repository.org.w3c.dom.events.EventTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSProgressEvent#getPosition() public abstract int org.w3c.dom.ls.LSProgressEvent.getPosition()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPosition() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSProgressEvent#getInput() public abstract org.w3c.dom.ls.LSInput org.w3c.dom.ls.LSProgressEvent.getInput()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInput() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.w3c.dom.ls.LSProgressEvent#getTotalSize() public abstract int org.w3c.dom.ls.LSProgressEvent.getTotalSize()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTotalSize() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
