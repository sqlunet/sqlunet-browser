/*
 * Copyright (c) 2026. Bernard Bou
 */
package org.sqlunet.browser.wn

import org.sqlunet.browser.MainActivity
import org.sqlunet.browser.wn.Oewn.hook

class MainActivity : MainActivity() {

    override fun onStart() {
        super.onStart()
        hook(this)
    }
}
