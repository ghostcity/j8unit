package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterizableClassTest
implements org.j8unit.repository.javax.lang.model.element.ParameterizableClassTests<javax.lang.model.element.Parameterizable> {

    @Override
    public Class<javax.lang.model.element.Parameterizable> createNewSUT() {
        return javax.lang.model.element.Parameterizable.class;
    }

}