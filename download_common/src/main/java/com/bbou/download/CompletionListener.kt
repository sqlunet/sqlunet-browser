/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */

package com.bbou.download

/**
 * Completion callback fired by fragment to activity
 */
fun interface CompletionListener {

    /**
     * onComplete
     *
     * @param success flag
     */
    fun onComplete(success: Boolean)
}