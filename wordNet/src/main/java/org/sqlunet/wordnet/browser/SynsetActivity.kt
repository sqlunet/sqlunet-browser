/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.wordnet.browser

import androidx.fragment.app.Fragment
import org.sqlunet.browser.AbstractDataActivity
import org.sqlunet.wordnet.R

/**
 * Synset activity
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
open class SynsetActivity : AbstractDataActivity() {

    override val layoutId: Int
        get() = R.layout.activity_synset

    override val containerId: Int
        get() = R.id.container_synset

    override fun makeFragment(): Fragment {
        return SynsetFragment()
    }
}
