package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobPrioritySupported;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.JavaBug;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JobPrioritySupported} (by simply reusing
 * the J8Unit test interface
 * {@link org.j8unit.repository.javax.print.attribute.standard.JobPrioritySupportedClassTests}).
 */
@RunWith(J8Unit4.class)
public class JobPrioritySupportedClassTest
implements JobPrioritySupportedClassTests<JobPrioritySupported> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.JobPrioritySupported]

    @Override
    public Class<JobPrioritySupported> createNewSUT() {
        return JobPrioritySupported.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.print.attribute.standard.JobPrioritySupported#JobPrioritySupported(int) public
     * javax.print.attribute.standard.JobPrioritySupported(int)}.
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
    public void create_JobPrioritySupported_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JobPrioritySupported sut = null; // = new JobPrioritySupported(int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.JobPrioritySupported]

    /**
     * @see JobPrioritySupportedClassBugs#equalsWithoutHashCode() Overridden {@code #equals(Object)} method without
     *      corresponding overridden {@code #hashCode()}!
     *
     * @since 0.9.7
     */
    @Test
    @Category(JavaBug.class)
    @Override
    public void wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode() {
        JobPrioritySupportedClassTests.super.wheneverEqualsIsOverriddenItIsGenerallyNecessaryToOverrideHashCode();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.JobPrioritySupported]

}
