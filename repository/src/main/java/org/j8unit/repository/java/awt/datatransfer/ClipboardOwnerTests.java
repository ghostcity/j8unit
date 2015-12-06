package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.datatransfer.ClipboardOwner interface java.awt.datatransfer.ClipboardOwner},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.datatransfer.ClipboardOwnerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClipboardOwnerTests<SUT extends java.awt.datatransfer.ClipboardOwner>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.awt.datatransfer.ClipboardOwner#lostOwnership(java.awt.datatransfer.Clipboard,java.awt.datatransfer.Transferable)
     * public abstract void
     * java.awt.datatransfer.ClipboardOwner.lostOwnership(java.awt.datatransfer.Clipboard,java.awt.datatransfer.Transferable)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lostOwnership_Clipboard_Transferable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}