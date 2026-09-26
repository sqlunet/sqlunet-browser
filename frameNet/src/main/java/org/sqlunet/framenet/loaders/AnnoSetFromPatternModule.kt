/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.framenet.loaders

import android.os.Parcelable
import org.sqlunet.browser.TreeFragment
import org.sqlunet.framenet.FnPatternPointer
import org.sqlunet.treeview.model.TreeNode

/**
 * AnnoSet from pattern module
 *
 * @param fragment containing fragment
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
class AnnoSetFromPatternModule(fragment: TreeFragment) : BaseModule(fragment) {

    /**
     * Pattern id
     */
    private var patternId: Long? = null

    override fun unmarshal(pointer: Parcelable) {
        patternId = null
        if (pointer is FnPatternPointer) {
            patternId = pointer.id
        }
    }

    override fun process(node: TreeNode) {
        if (patternId != null) {
            annoSetsForPattern(patternId!!, node)
        }
    }
}
