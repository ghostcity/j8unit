package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPathFunctionResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XPathFunctionResolver} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.xpath.XPathFunctionResolverClassTests}).
 */
@RunWith(J8Unit4.class)
public class XPathFunctionResolverClassTest
implements XPathFunctionResolverClassTests<XPathFunctionResolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.xpath.XPathFunctionResolver]

    @Override
    public Class<XPathFunctionResolver> createNewSUT() {
        return XPathFunctionResolver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.xpath.XPathFunctionResolver]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.xpath.XPathFunctionResolver]

}
