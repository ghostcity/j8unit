package org.j8unit.repository.javax.swing.plaf.synth;

import javax.swing.plaf.synth.SynthContext;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SynthContextClassTest
implements org.j8unit.repository.javax.swing.plaf.synth.SynthContextClassTests<SynthContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.synth.SynthContext]

    @Override
    public Class<SynthContext> createNewSUT() {
        return SynthContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.plaf.synth.SynthContext#SynthContext(javax.swing.JComponent, javax.swing.plaf.synth.Region, javax.swing.plaf.synth.SynthStyle, int)
     * public
     * javax.swing.plaf.synth.SynthContext(javax.swing.JComponent,javax.swing.plaf.synth.Region,javax.swing.plaf.synth.SynthStyle,int)}
     * .
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
    public void create_SynthContext_JComponent_Region_SynthStyle_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SynthContext sut = null; // = new SynthContext(javax.swing.JComponent, javax.swing.plaf.synth.Region,
                                       // javax.swing.plaf.synth.SynthStyle, int);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.synth.SynthContext]

}
