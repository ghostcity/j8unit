package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.Locator;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Locator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.LocatorTests}).
 */
@RunWith(J8Unit4.class)
public class LocatorTest
implements LocatorTests<Locator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.Locator]

    @Override
    public Locator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.Locator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.Locator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.Locator]

}
