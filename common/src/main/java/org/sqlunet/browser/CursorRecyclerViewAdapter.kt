/*
 * Copyright (c) 2026. Bernard Bou
 */

package org.sqlunet.browser

import android.database.Cursor

interface CursorRecyclerViewAdapter {
    fun changeCursor(cursor: Cursor?)
    fun getCursor(): Cursor?
}
