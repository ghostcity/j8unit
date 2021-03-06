package org.j8unit.repository.java.io;

import java.io.RandomAccessFile;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RandomAccessFile} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.RandomAccessFileClassTests}).
 */
@RunWith(J8Unit4.class)
public class RandomAccessFileClassTest
implements RandomAccessFileClassTests<RandomAccessFile> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.RandomAccessFile]

    @Override
    public Class<RandomAccessFile> createNewSUT() {
        return RandomAccessFile.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.RandomAccessFile#RandomAccessFile(String, String) public
     * java.io.RandomAccessFile(java.lang.String,java.lang.String) throws java.io.FileNotFoundException}.
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
    public void create_RandomAccessFile_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RandomAccessFile sut = null; // = new RandomAccessFile(String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.RandomAccessFile#RandomAccessFile(java.io.File, String) public
     * java.io.RandomAccessFile(java.io.File,java.lang.String) throws java.io.FileNotFoundException}.
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
    public void create_RandomAccessFile_File_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RandomAccessFile sut = null; // = new RandomAccessFile(java.io.File, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.RandomAccessFile]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.RandomAccessFile]

}
