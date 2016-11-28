package org.j8unit.repository.java.awt.image;

import java.awt.image.TileObserver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TileObserver} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.TileObserverClassTests}).
 */
@RunWith(J8Unit4.class)
public class TileObserverClassTest
implements TileObserverClassTests<TileObserver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.TileObserver]

    @Override
    public Class<TileObserver> createNewSUT() {
        return TileObserver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.TileObserver]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.TileObserver]

}
