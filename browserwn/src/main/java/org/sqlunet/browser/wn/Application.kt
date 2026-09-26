/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.browser.wn

import org.sqlunet.browser.wn.common.CommonApplication

class Application : CommonApplication() {

    /**
     * Drop data
     *
     * @return true if flagged in build config
     */
    override fun dropData(): Boolean {
        return BuildConfig.DROP_DATA
    }

    /**
     * Build time
     *
     * @return build time
     */
    override fun buildTime(): String {
        return BuildConfig.BUILD_TIME
    }

    /**
     * Git hash
     *
     * @return git hash
     */
    override fun gitHash(): String {
        return BuildConfig.GIT_HASH
    }
}
