package org.j8unit.repository.java.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SQLOutputClassTest
implements org.j8unit.repository.java.sql.SQLOutputClassTests<java.sql.SQLOutput> {

    @Override
    public Class<java.sql.SQLOutput> createNewSUT() {
        return java.sql.SQLOutput.class;
    }

}