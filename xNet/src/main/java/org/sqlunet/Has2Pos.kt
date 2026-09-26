/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet

/**
 * Has part-of-speech interface
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
interface Has2Pos : HasPos {

    /**
     * Get pos
     *
     * @return pos
     */
    fun getPos2(): Char?
}
