/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.treeview.control

import androidx.annotation.LayoutRes
import org.sqlunet.treeview.R

/**
 * More controller with icon
 *
 * @param breakExpand whether this controller breaks expansion
 *
 * @author Bogdan Melnychuk on 2/12/15.
 */
class MoreController(breakExpand: Boolean) : BaseController(breakExpand) {

    @LayoutRes
    override val layoutResId = R.layout.layout_node_link
}
