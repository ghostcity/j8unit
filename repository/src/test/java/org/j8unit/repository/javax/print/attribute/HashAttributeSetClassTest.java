package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HashAttributeSetClassTest
implements org.j8unit.repository.javax.print.attribute.HashAttributeSetClassTests<javax.print.attribute.HashAttributeSet> {

    @Override
    public Class<javax.print.attribute.HashAttributeSet> createNewSUT() {
        return javax.print.attribute.HashAttributeSet.class;
    }

}