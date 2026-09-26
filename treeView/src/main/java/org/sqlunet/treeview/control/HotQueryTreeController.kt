/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.treeview.control

import androidx.annotation.LayoutRes
import org.sqlunet.treeview.R

/**
 * Hot Query tree controller (expanding this controller will trigger query)
 *
 * @param breakExpand whether this controller breaks expansion
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
open class HotQueryTreeController(breakExpand: Boolean) : QueryTreeController(breakExpand) {

    @LayoutRes
    override val layoutResId = R.layout.layout_query

    override fun markExpanded() {
        junctionView.setImageResource(R.drawable.ic_hotquery_expanded)
    }

    override fun markCollapsed() {
        junctionView.setImageResource(R.drawable.ic_hotquery_collapsed)
    }

    override fun markDeadend() {
        junctionView.setImageResource(R.drawable.ic_hotquery_deadend)
    }
}
