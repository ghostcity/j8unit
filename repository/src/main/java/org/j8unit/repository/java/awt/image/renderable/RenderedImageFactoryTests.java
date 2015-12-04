package org.j8unit.repository.java.awt.image.renderable;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.image.renderable.RenderedImageFactory interface java.awt.image.renderable.RenderedImageFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.image.renderable.RenderedImageFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RenderedImageFactoryTests<SUT extends java.awt.image.renderable.RenderedImageFactory>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.image.renderable.RenderedImageFactory#create(java.awt.image.renderable.ParameterBlock,java.awt.RenderingHints) public abstract java.awt.image.RenderedImage java.awt.image.renderable.RenderedImageFactory.create(java.awt.image.renderable.ParameterBlock,java.awt.RenderingHints)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_ParameterBlock_RenderingHints() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
