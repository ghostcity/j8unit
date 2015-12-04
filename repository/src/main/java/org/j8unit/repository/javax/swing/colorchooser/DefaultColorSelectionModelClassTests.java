package org.j8unit.repository.javax.swing.colorchooser;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.colorchooser.DefaultColorSelectionModel class
 * javax.swing.colorchooser.DefaultColorSelectionModel}, containing all class relevant test methods (at least the test
 * methods of accessible constructors and of accessible {@code static} methods). The counterpart test class containing
 * the instance relevant test methods is
 * {@link org.j8unit.repository.javax.swing.colorchooser.DefaultColorSelectionModelTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.colorchooser.DefaultColorSelectionModelTests
 */
@Category(J8UnitRepository.class)
public abstract interface DefaultColorSelectionModelClassTests<SUT extends Class<? extends javax.swing.colorchooser.DefaultColorSelectionModel>>
extends org.j8unit.repository.javax.swing.colorchooser.ColorSelectionModelClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link javax.swing.colorchooser.DefaultColorSelectionModel#DefaultColorSelectionModel() public
     * javax.swing.colorchooser.DefaultColorSelectionModel()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultColorSelectionModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.colorchooser.DefaultColorSelectionModel sut = null; // = new DefaultColorSelectionModel();
    }

    /**
     * Test method for
     * {@link javax.swing.colorchooser.DefaultColorSelectionModel#DefaultColorSelectionModel(java.awt.Color) public
     * javax.swing.colorchooser.DefaultColorSelectionModel(java.awt.Color)}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_DefaultColorSelectionModel_Color()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.swing.colorchooser.DefaultColorSelectionModel sut = null; // = new
                                                                              // DefaultColorSelectionModel(java.awt.Color);
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.swing.colorchooser.DefaultColorSelectionModel> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.swing.colorchooser.DefaultColorSelectionModel.class.isAssignableFrom(sut));
    }

}
