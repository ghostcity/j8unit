package org.j8unit.repository.javax.sound.midi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.sound.midi.ShortMessage class javax.sound.midi.ShortMessage},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.sound.midi.ShortMessageTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sound.midi.ShortMessageTests
 */
@Category(J8UnitRepository.class)
public abstract interface ShortMessageClassTests<SUT extends Class<? extends javax.sound.midi.ShortMessage>>
extends org.j8unit.repository.javax.sound.midi.MidiMessageClassTests<SUT>
{

    /**
     * Test method for {@link javax.sound.midi.ShortMessage#ShortMessage(int,int,int,int) public javax.sound.midi.ShortMessage(int,int,int,int) throws javax.sound.midi.InvalidMidiDataException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ShortMessage_int_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.sound.midi.ShortMessage sut = null; // = new ShortMessage(int,int,int,int);
    }

    /**
     * Test method for {@link javax.sound.midi.ShortMessage#ShortMessage(int,int,int) public javax.sound.midi.ShortMessage(int,int,int) throws javax.sound.midi.InvalidMidiDataException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ShortMessage_int_int_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.sound.midi.ShortMessage sut = null; // = new ShortMessage(int,int,int);
    }

    /**
     * Test method for {@link javax.sound.midi.ShortMessage#ShortMessage(int) public javax.sound.midi.ShortMessage(int) throws javax.sound.midi.InvalidMidiDataException}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ShortMessage_int() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.sound.midi.ShortMessage sut = null; // = new ShortMessage(int);
    }

    /**
     * Test method for {@link javax.sound.midi.ShortMessage#ShortMessage() public javax.sound.midi.ShortMessage()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_ShortMessage() throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        javax.sound.midi.ShortMessage sut = null; // = new ShortMessage();
    }

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.sound.midi.ShortMessage> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.sound.midi.ShortMessage.class.isAssignableFrom(sut));
    }

}
