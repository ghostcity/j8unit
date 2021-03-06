package org.j8unit.repository.javax.activation;

import javax.activation.DataSource;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DataSource} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.activation.DataSourceClassTests}).
 */
@RunWith(J8Unit4.class)
public class DataSourceClassTest
implements DataSourceClassTests<DataSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.DataSource]

    @Override
    public Class<DataSource> createNewSUT() {
        return DataSource.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.DataSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.DataSource]

}
