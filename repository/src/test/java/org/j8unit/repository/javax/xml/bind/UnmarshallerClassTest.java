package org.j8unit.repository.javax.xml.bind;

import static org.junit.Assert.fail;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Unmarshaller.Listener;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Unmarshaller} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.UnmarshallerClassTests}).
 */
@RunWith(J8Unit4.class)
public class UnmarshallerClassTest
implements UnmarshallerClassTests<Unmarshaller> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.Unmarshaller]

    @Override
    public Class<Unmarshaller> createNewSUT() {
        return Unmarshaller.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.Unmarshaller]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.Unmarshaller]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Listener} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.UnmarshallerClassTests.ListenerClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ListenerClassTest
    implements ListenerClassTests<Listener> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.Unmarshaller$Listener]

        @Override
        public Class<Listener> createNewSUT() {
            return Listener.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.xml.bind.Unmarshaller.Listener#Listener() public javax.xml.bind.Unmarshaller$Listener()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_Listener()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.Unmarshaller$Listener]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.Unmarshaller$Listener]

    }

}
