package org.j8unit.repository.java.util.zip;

import java.util.zip.ZipFile;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ZipFile} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.zip.ZipFileTests}).
 */
@RunWith(J8Unit4.class)
public class ZipFileTest
implements ZipFileTests<ZipFile> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.zip.ZipFile]

    @Override
    public ZipFile createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.zip.ZipFile], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.zip.ZipFile]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.zip.ZipFile]

}
