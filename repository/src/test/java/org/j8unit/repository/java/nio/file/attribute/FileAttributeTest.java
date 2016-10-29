package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileAttributeTest<T>
implements org.j8unit.repository.java.nio.file.attribute.FileAttributeTests<FileAttribute<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.FileAttribute]

    @Override
    public FileAttribute<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.attribute.FileAttribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.FileAttribute]

}