package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileTypeMapClassTest
implements org.j8unit.repository.javax.activation.FileTypeMapClassTests<javax.activation.FileTypeMap> {

    @Override
    public Class<javax.activation.FileTypeMap> createNewSUT() {
        return javax.activation.FileTypeMap.class;
    }

}