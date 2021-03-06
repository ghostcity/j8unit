package org.j8unit.repository.java.nio.file;

import java.nio.file.FileSystems;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileSystems} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.FileSystemsClassTests}).
 */
@RunWith(J8Unit4.class)
public class FileSystemsClassTest
implements FileSystemsClassTests<FileSystems> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.FileSystems]

    @Override
    public Class<FileSystems> createNewSUT() {
        return FileSystems.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.file.FileSystems#getDefault() public static
     * java.nio.file.FileSystem java.nio.file.FileSystems.getDefault()}.
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
    public void test_getDefault()
    throws Exception {
        // write some test for {@link java.nio.file.FileSystems#getDefault()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.file.FileSystems#getFileSystem(java.net.URI) public static java.nio.file.FileSystem
     * java.nio.file.FileSystems.getFileSystem(java.net.URI)}.
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
    public void test_getFileSystem_URI()
    throws Exception {
        // write some test for {@link java.nio.file.FileSystems#getFileSystem(java.net.URI)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.file.FileSystems#newFileSystem(java.net.URI, java.util.Map, ClassLoader) public static
     * java.nio.file.FileSystem java.nio.file.FileSystems.newFileSystem(java.net.URI,java.util.Map<java.lang.String,
     * ?>,java.lang.ClassLoader) throws java.io.IOException}.
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
    public void test_newFileSystem_URI_Map_ClassLoader()
    throws Exception {
        // write some test for {@link java.nio.file.FileSystems#newFileSystem(java.net.URI, java.util.Map, ClassLoader)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.file.FileSystems#newFileSystem(java.nio.file.Path, ClassLoader) public static
     * java.nio.file.FileSystem java.nio.file.FileSystems.newFileSystem(java.nio.file.Path,java.lang.ClassLoader) throws
     * java.io.IOException}.
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
    public void test_newFileSystem_Path_ClassLoader()
    throws Exception {
        // write some test for {@link java.nio.file.FileSystems#newFileSystem(java.nio.file.Path, ClassLoader)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.file.FileSystems#newFileSystem(java.net.URI, java.util.Map) public static
     * java.nio.file.FileSystem java.nio.file.FileSystems.newFileSystem(java.net.URI,java.util.Map<java.lang.String, ?>)
     * throws java.io.IOException}.
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
    public void test_newFileSystem_URI_Map()
    throws Exception {
        // write some test for {@link java.nio.file.FileSystems#newFileSystem(java.net.URI, java.util.Map)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.FileSystems]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.FileSystems]

}
