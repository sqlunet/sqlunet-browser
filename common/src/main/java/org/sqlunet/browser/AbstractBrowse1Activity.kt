/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.browser

import org.sqlunet.browser.NightMode.createOverrideConfigurationForDayNight

abstract class AbstractBrowse1Activity : BaseActivity() {

    override fun onNightModeChanged(mode: Int) {
        super.onNightModeChanged(mode)
        val overrideConfig = createOverrideConfigurationForDayNight(this, mode)
        application.onConfigurationChanged(overrideConfig)
    }
}
