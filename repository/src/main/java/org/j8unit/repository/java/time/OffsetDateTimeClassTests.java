package org.j8unit.repository.java.time;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.time.OffsetDateTime class java.time.OffsetDateTime},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.time.OffsetDateTimeTests}.
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
 * @see org.j8unit.repository.java.time.OffsetDateTimeTests
 */
@Category(J8UnitRepository.class)
public abstract interface OffsetDateTimeClassTests<SUT extends Class<? extends java.time.OffsetDateTime>>
extends org.j8unit.repository.java.time.temporal.TemporalClassTests<SUT>,
        org.j8unit.repository.java.time.temporal.TemporalAdjusterClassTests<SUT>,
        org.j8unit.repository.java.lang.ComparableClassTests<SUT,java.time.OffsetDateTime>,
        org.j8unit.repository.java.io.SerializableClassTests<SUT>,
        org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.time.OffsetDateTime> sut = createNewSUT();
        // assert assignability
        assertTrue(java.time.OffsetDateTime.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#ofInstant(java.time.Instant,java.time.ZoneId) public static java.time.OffsetDateTime java.time.OffsetDateTime.ofInstant(java.time.Instant,java.time.ZoneId)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_ofInstant_Instant_ZoneId() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#of(java.time.LocalDate,java.time.LocalTime,java.time.ZoneOffset) public static java.time.OffsetDateTime java.time.OffsetDateTime.of(java.time.LocalDate,java.time.LocalTime,java.time.ZoneOffset)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_LocalDate_LocalTime_ZoneOffset() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#of(java.time.LocalDateTime,java.time.ZoneOffset) public static java.time.OffsetDateTime java.time.OffsetDateTime.of(java.time.LocalDateTime,java.time.ZoneOffset)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_LocalDateTime_ZoneOffset() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#of(int,int,int,int,int,int,int,java.time.ZoneOffset) public static java.time.OffsetDateTime java.time.OffsetDateTime.of(int,int,int,int,int,int,int,java.time.ZoneOffset)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_of_int_int_int_int_int_int_int_ZoneOffset() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#now(java.time.ZoneId) public static java.time.OffsetDateTime java.time.OffsetDateTime.now(java.time.ZoneId)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_now_ZoneId() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#now() public static java.time.OffsetDateTime java.time.OffsetDateTime.now()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_now() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#now(java.time.Clock) public static java.time.OffsetDateTime java.time.OffsetDateTime.now(java.time.Clock)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_now_Clock() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#parse(java.lang.CharSequence) public static java.time.OffsetDateTime java.time.OffsetDateTime.parse(java.lang.CharSequence)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_CharSequence() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#parse(java.lang.CharSequence,java.time.format.DateTimeFormatter) public static java.time.OffsetDateTime java.time.OffsetDateTime.parse(java.lang.CharSequence,java.time.format.DateTimeFormatter)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parse_CharSequence_DateTimeFormatter() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#from(java.time.temporal.TemporalAccessor) public static java.time.OffsetDateTime java.time.OffsetDateTime.from(java.time.temporal.TemporalAccessor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_from_TemporalAccessor() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.time.OffsetDateTime#timeLineOrder() public static java.util.Comparator java.time.OffsetDateTime.timeLineOrder()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_timeLineOrder() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
