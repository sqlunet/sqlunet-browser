/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet

/**
 * Has 2 word-ids interface
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
interface Has2WordId : HasWordId {

    /**
     * Get word 2 id
     *
     * @return word 2 id
     */
    fun getWord2Id(): Long
}
