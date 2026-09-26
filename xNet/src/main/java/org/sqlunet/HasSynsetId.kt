/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet

/**
 * Has synset-id interface
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
fun interface HasSynsetId {

    /**
     * Get synset id
     *
     * @return synset id
     */
    fun getSynsetId(): Long
}
