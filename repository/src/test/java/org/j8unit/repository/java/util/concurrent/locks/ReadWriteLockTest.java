package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.ReadWriteLock;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReadWriteLockTest
implements org.j8unit.repository.java.util.concurrent.locks.ReadWriteLockTests<ReadWriteLock> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.ReadWriteLock]

    @Override
    public ReadWriteLock createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.locks.ReadWriteLock], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.ReadWriteLock]

}