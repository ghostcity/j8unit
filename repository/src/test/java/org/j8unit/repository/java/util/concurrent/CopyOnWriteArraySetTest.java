package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CopyOnWriteArraySetTest<E>
implements org.j8unit.repository.java.util.concurrent.CopyOnWriteArraySetTests<java.util.concurrent.CopyOnWriteArraySet<E>, E> {

    @Override
    public java.util.concurrent.CopyOnWriteArraySet<E> createNewSUT() {
        return new java.util.concurrent.CopyOnWriteArraySet<>();
    }

}