package org.j8unit.repository.java.awt;

import java.awt.PrintJob;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobTest
implements org.j8unit.repository.java.awt.PrintJobTests<PrintJob> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PrintJob]

    @Override
    public PrintJob createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.PrintJob], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.PrintJob]

}