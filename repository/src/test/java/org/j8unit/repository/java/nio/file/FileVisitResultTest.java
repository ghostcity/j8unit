package org.j8unit.repository.java.nio.file;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import java.nio.file.FileVisitResult;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FileVisitResult} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.nio.file.FileVisitResultTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class FileVisitResultTest
implements FileVisitResultTests<FileVisitResult> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileVisitResult]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOfEnumClass(FileVisitResult.class);
    }

    @Parameter(0)
    public FileVisitResult sut;

    @Override
    public FileVisitResult createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.FileVisitResult]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.FileVisitResult]

}
