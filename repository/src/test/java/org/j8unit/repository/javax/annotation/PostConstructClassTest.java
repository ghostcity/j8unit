package org.j8unit.repository.javax.annotation;

import javax.annotation.PostConstruct;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PostConstruct} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.annotation.PostConstructClassTests}).
 */
@RunWith(J8Unit4.class)
public class PostConstructClassTest
implements PostConstructClassTests<PostConstruct> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.PostConstruct]

    @Override
    public Class<PostConstruct> createNewSUT() {
        return PostConstruct.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.PostConstruct]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.PostConstruct]

}
