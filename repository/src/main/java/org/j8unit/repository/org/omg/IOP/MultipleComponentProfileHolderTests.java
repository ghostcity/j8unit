package org.j8unit.repository.org.omg.IOP;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.IOP.MultipleComponentProfileHolder class org.omg.IOP.MultipleComponentProfileHolder},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.IOP.MultipleComponentProfileHolderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MultipleComponentProfileHolderTests<SUT extends org.omg.IOP.MultipleComponentProfileHolder>
extends org.j8unit.repository.org.omg.CORBA.portable.StreamableTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.IOP.MultipleComponentProfileHolder#_read(org.omg.CORBA.portable.InputStream) public void org.omg.IOP.MultipleComponentProfileHolder._read(org.omg.CORBA.portable.InputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__read_InputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.MultipleComponentProfileHolder#_write(org.omg.CORBA.portable.OutputStream) public void org.omg.IOP.MultipleComponentProfileHolder._write(org.omg.CORBA.portable.OutputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__write_OutputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.IOP.MultipleComponentProfileHolder#_type() public org.omg.CORBA.TypeCode org.omg.IOP.MultipleComponentProfileHolder._type()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__type() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
