package org.j8unit.repository.javax.swing;

import javax.swing.Renderer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RendererTest
implements org.j8unit.repository.javax.swing.RendererTests<Renderer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Renderer]

    @Override
    public Renderer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.Renderer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Renderer]

}