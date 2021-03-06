package org.j8unit.repository.java.awt;

import java.awt.JobAttributes;
import java.awt.JobAttributes.DefaultSelectionType;
import java.awt.JobAttributes.DestinationType;
import java.awt.JobAttributes.DialogType;
import java.awt.JobAttributes.MultipleDocumentHandlingType;
import java.awt.JobAttributes.SidesType;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JobAttributes} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.JobAttributesClassTests}).
 */
@RunWith(J8Unit4.class)
public class JobAttributesClassTest
implements JobAttributesClassTests<JobAttributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes]

    @Override
    public Class<JobAttributes> createNewSUT() {
        return JobAttributes.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.JobAttributes#JobAttributes(java.awt.JobAttributes) public
     * java.awt.JobAttributes(java.awt.JobAttributes)}.
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
    public void create_JobAttributes_JobAttributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JobAttributes sut = null; // = new JobAttributes(java.awt.JobAttributes);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.JobAttributes#JobAttributes(int, java.awt.JobAttributes.DefaultSelectionType, java.awt.JobAttributes.DestinationType, java.awt.JobAttributes.DialogType, String, int, int, java.awt.JobAttributes.MultipleDocumentHandlingType, int[][], String, java.awt.JobAttributes.SidesType)
     * public
     * java.awt.JobAttributes(int,java.awt.JobAttributes$DefaultSelectionType,java.awt.JobAttributes$DestinationType,java.awt.JobAttributes$DialogType,java.lang.String,int,int,java.awt.JobAttributes$MultipleDocumentHandlingType,int[][],java.lang.String,java.awt.JobAttributes$SidesType)}.
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
    public void create_JobAttributes_int_DefaultSelectionType_DestinationType_DialogType_String_int_int_MultipleDocumentHandlingType_intArrayArray_String_SidesType()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JobAttributes sut = null; // = new JobAttributes(int, java.awt.JobAttributes.DefaultSelectionType,
                                        // java.awt.JobAttributes.DestinationType, java.awt.JobAttributes.DialogType,
                                        // String, int, int, java.awt.JobAttributes.MultipleDocumentHandlingType,
                                        // int[][], String, java.awt.JobAttributes.SidesType);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.JobAttributes#JobAttributes() public
     * java.awt.JobAttributes()}.
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
    public void create_JobAttributes()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JobAttributes sut = new JobAttributes();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.JobAttributes]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link SidesType} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.awt.JobAttributesClassTests.SidesTypeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class SidesTypeClassTest
    implements SidesTypeClassTests<SidesType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes$SidesType]

        @Override
        public Class<SidesType> createNewSUT() {
            return SidesType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.JobAttributes$SidesType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes$SidesType]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DialogType} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.awt.JobAttributesClassTests.DialogTypeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DialogTypeClassTest
    implements DialogTypeClassTests<DialogType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes$DialogType]

        @Override
        public Class<DialogType> createNewSUT() {
            return DialogType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.JobAttributes$DialogType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes$DialogType]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DestinationType} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.java.awt.JobAttributesClassTests.DestinationTypeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DestinationTypeClassTest
    implements DestinationTypeClassTests<DestinationType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes$DestinationType]

        @Override
        public Class<DestinationType> createNewSUT() {
            return DestinationType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.JobAttributes$DestinationType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes$DestinationType]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link MultipleDocumentHandlingType} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.awt.JobAttributesClassTests.MultipleDocumentHandlingTypeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class MultipleDocumentHandlingTypeClassTest
    implements MultipleDocumentHandlingTypeClassTests<MultipleDocumentHandlingType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes$MultipleDocumentHandlingType]

        @Override
        public Class<MultipleDocumentHandlingType> createNewSUT() {
            return MultipleDocumentHandlingType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.JobAttributes$MultipleDocumentHandlingType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes$MultipleDocumentHandlingType]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultSelectionType} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.awt.JobAttributesClassTests.DefaultSelectionTypeClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DefaultSelectionTypeClassTest
    implements DefaultSelectionTypeClassTests<DefaultSelectionType> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.JobAttributes$DefaultSelectionType]

        @Override
        public Class<DefaultSelectionType> createNewSUT() {
            return DefaultSelectionType.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.JobAttributes$DefaultSelectionType]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.JobAttributes$DefaultSelectionType]

    }

}
