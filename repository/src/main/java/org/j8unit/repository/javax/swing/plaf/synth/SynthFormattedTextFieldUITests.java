package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.synth.SynthFormattedTextFieldUI class
 * javax.swing.plaf.synth.SynthFormattedTextFieldUI}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.synth.SynthFormattedTextFieldUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.synth.SynthFormattedTextFieldUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.synth.SynthFormattedTextFieldUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SynthFormattedTextFieldUITests<SUT extends javax.swing.plaf.synth.SynthFormattedTextFieldUI>
extends org.j8unit.repository.javax.swing.plaf.synth.SynthTextFieldUITests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.synth.SynthFormattedTextFieldUI#paintBorder(javax.swing.plaf.synth.SynthContext, java.awt.Graphics, int, int, int, int)
     * public void
     * javax.swing.plaf.synth.SynthFormattedTextFieldUI.paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int,int,int,int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.synth.SynthFormattedTextFieldUI#paintBorder(javax.swing.plaf.synth.SynthContext,
     *             java.awt.Graphics, int, int, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paintBorder_SynthContext_Graphics_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
