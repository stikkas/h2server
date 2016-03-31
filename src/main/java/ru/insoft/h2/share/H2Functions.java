package ru.insoft.h2.share;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Functions for use in project sic-stores
 * @author stikkas<stikkas@yandex.ru>
 */
public class H2Functions {

    /**
     * Set right last number of the sequence
     * @param conn sql connection
     * @param sequenceName name of the sequence
     * @param value number which sequence should be set
     * @return new last number of the sequence
     * @throws SQLException 
     */
    public static Long setSequenceValue(Connection conn, String sequenceName, Long value) throws SQLException {
        conn.createStatement().execute("ALTER SEQUENCE " + sequenceName + " RESTART WITH " + value);
        return value;
    }
}
