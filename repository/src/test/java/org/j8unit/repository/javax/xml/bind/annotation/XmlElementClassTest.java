package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElement.DEFAULT;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlElement} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlElementClassTest
implements XmlElementClassTests<XmlElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlElement]

    @Override
    public Class<XmlElement> createNewSUT() {
        return XmlElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlElement]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DEFAULT} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.xml.bind.annotation.XmlElementClassTests.DEFAULTClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class DEFAULTClassTest
    implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementClassTests.DEFAULTClassTests<DEFAULT> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlElement$DEFAULT]

        @Override
        public Class<DEFAULT> createNewSUT() {
            return DEFAULT.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.xml.bind.annotation.XmlElement.DEFAULT#DEFAULT() public
         * javax.xml.bind.annotation.XmlElement$DEFAULT()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_DEFAULT()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final DEFAULT sut = new DEFAULT();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlElement$DEFAULT]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlElement$DEFAULT]

    }

}
