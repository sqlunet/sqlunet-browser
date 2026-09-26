/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.treeview.control

/**
 * Cold Query tree controller (expanding this controller will trigger query)
 *
 * @param breakExpand whether this controller breaks expansion
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
open class ColdQueryTreeController(breakExpand: Boolean) : QueryTreeController(breakExpand) {

    override fun fire() {
        if (node.isLeaf) {
            processQuery()
        }
    }
}
