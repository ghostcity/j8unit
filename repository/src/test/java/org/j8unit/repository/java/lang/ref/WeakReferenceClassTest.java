package org.j8unit.repository.java.lang.ref;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class WeakReferenceClassTest
implements org.j8unit.repository.java.lang.ref.WeakReferenceClassTests<java.lang.ref.WeakReference> {

    @Override
    public Class<java.lang.ref.WeakReference> createNewSUT() {
        return java.lang.ref.WeakReference.class;
    }

}