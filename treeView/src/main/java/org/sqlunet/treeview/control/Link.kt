/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.treeview.control

/**
 * Link Data
 *
 * @param id id
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
abstract class Link protected constructor(
    /**
     * Id used in link
     */
    val id: Long,
) {

    /**
     * Process
     */
    abstract fun process()
}
