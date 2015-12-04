package org.j8unit.repository.java.util.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.spi.CalendarNameProvider class java.util.spi.CalendarNameProvider},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.spi.CalendarNameProviderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CalendarNameProviderTests<SUT extends java.util.spi.CalendarNameProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.spi.CalendarNameProvider#getDisplayName(java.lang.String,int,int,int,java.util.Locale) public abstract java.lang.String java.util.spi.CalendarNameProvider.getDisplayName(java.lang.String,int,int,int,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayName_String_int_int_int_Locale() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.spi.CalendarNameProvider#getDisplayNames(java.lang.String,int,int,java.util.Locale) public abstract java.util.Map java.util.spi.CalendarNameProvider.getDisplayNames(java.lang.String,int,int,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayNames_String_int_int_Locale() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
