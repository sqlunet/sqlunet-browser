/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.wordnet.sql

import android.database.sqlite.SQLiteDatabase
import org.sqlunet.sql.DBQuery

/**
 * Word query
 *
 * @param connection connection
 * @param word       is the word
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
internal class WordQueryFromWord(connection: SQLiteDatabase, word: String) : DBQuery(connection, QUERY) {

    init {
        setParams(word)
    }

    /**
     * Word id value from the result set
     */
    val id: Int
        get() = cursor!!.getInt(0)

    /**
     * Word string value from the result set
     */
    val word: String
        get() = cursor!!.getString(1)

    companion object {

        /**
         * `QUERY` is the SQL statement
         */
        private const val QUERY = SqLiteDialect.WordQueryFromWord
    }
}
