/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.framenet.browser

import androidx.fragment.app.Fragment
import org.sqlunet.browser.AbstractDataActivity
import org.sqlunet.framenet.R

/**
 * Sentence activity
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
class FnSentenceActivity : AbstractDataActivity() {

    override val layoutId: Int
        get() = R.layout.activity_fnsentence

    override val containerId: Int
        get() = R.id.container_fnsentence

    override fun makeFragment(): Fragment {
        return FnSentenceFragment()
    }
}
