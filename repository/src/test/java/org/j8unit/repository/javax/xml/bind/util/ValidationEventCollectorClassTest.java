package org.j8unit.repository.javax.xml.bind.util;

import javax.xml.bind.util.ValidationEventCollector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidationEventCollectorClassTest
implements org.j8unit.repository.javax.xml.bind.util.ValidationEventCollectorClassTests<ValidationEventCollector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.util.ValidationEventCollector]

    @Override
    public Class<ValidationEventCollector> createNewSUT() {
        return ValidationEventCollector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.bind.util.ValidationEventCollector#ValidationEventCollector() public
     * javax.xml.bind.util.ValidationEventCollector()}.
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
    public void create_ValidationEventCollector()
    throws Exception {
        // create new instance
        final ValidationEventCollector sut = new ValidationEventCollector();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.util.ValidationEventCollector]

}
