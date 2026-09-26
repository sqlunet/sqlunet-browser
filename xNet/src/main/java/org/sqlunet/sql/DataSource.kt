/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.sql

import android.database.sqlite.SQLiteDatabase

/**
 * Data source wrapping to use JDBC style
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
class DataSource(path: String) : AutoCloseable {

    /**
     * Connection as database
     */
    val connection: SQLiteDatabase = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY)

    /**
     * Close
     */
    override fun close() {
        connection.close()
    }
}
