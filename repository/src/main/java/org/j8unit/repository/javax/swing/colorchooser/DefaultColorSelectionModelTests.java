package org.j8unit.repository.javax.swing.colorchooser;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.colorchooser.DefaultColorSelectionModel class javax.swing.colorchooser.DefaultColorSelectionModel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.colorchooser.DefaultColorSelectionModelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DefaultColorSelectionModelTests<SUT extends javax.swing.colorchooser.DefaultColorSelectionModel>
extends org.j8unit.repository.javax.swing.colorchooser.ColorSelectionModelTests<SUT>,
        org.j8unit.repository.java.io.SerializableTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.colorchooser.DefaultColorSelectionModel#setSelectedColor(java.awt.Color) public void javax.swing.colorchooser.DefaultColorSelectionModel.setSelectedColor(java.awt.Color)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setSelectedColor_Color() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.colorchooser.DefaultColorSelectionModel#addChangeListener(javax.swing.event.ChangeListener) public void javax.swing.colorchooser.DefaultColorSelectionModel.addChangeListener(javax.swing.event.ChangeListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addChangeListener_ChangeListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.colorchooser.DefaultColorSelectionModel#getSelectedColor() public java.awt.Color javax.swing.colorchooser.DefaultColorSelectionModel.getSelectedColor()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getSelectedColor() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.colorchooser.DefaultColorSelectionModel#getChangeListeners() public javax.swing.event.ChangeListener[] javax.swing.colorchooser.DefaultColorSelectionModel.getChangeListeners()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getChangeListeners() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.colorchooser.DefaultColorSelectionModel#removeChangeListener(javax.swing.event.ChangeListener) public void javax.swing.colorchooser.DefaultColorSelectionModel.removeChangeListener(javax.swing.event.ChangeListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeChangeListener_ChangeListener() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
