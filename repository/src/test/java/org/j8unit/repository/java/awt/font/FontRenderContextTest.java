package org.j8unit.repository.java.awt.font;

import java.awt.font.FontRenderContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FontRenderContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.font.FontRenderContextTests}).
 */
@RunWith(J8Unit4.class)
public class FontRenderContextTest
implements FontRenderContextTests<FontRenderContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.FontRenderContext]

    @Override
    public FontRenderContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.font.FontRenderContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.FontRenderContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.FontRenderContext]

}
