package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.Node;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Node} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.xml.soap.NodeClassTests}).
 */
@RunWith(J8Unit4.class)
public class NodeClassTest
implements NodeClassTests<Node> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.Node]

    @Override
    public Class<Node> createNewSUT() {
        return Node.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.Node]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.Node]

}
