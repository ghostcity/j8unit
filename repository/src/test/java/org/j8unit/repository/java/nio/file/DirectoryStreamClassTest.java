package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class DirectoryStreamClassTest
implements org.j8unit.repository.java.nio.file.DirectoryStreamClassTests<java.nio.file.DirectoryStream> {

    @RunWith(J8Unit4.class)
    public static class FilterClassTest
    implements org.j8unit.repository.java.nio.file.DirectoryStreamClassTests.FilterClassTests<java.nio.file.DirectoryStream.Filter> {

        @Override
        public Class<java.nio.file.DirectoryStream.Filter> createNewSUT() {
            return java.nio.file.DirectoryStream.Filter.class;
        }

    }

    @Override
    public Class<java.nio.file.DirectoryStream> createNewSUT() {
        return java.nio.file.DirectoryStream.class;
    }

}