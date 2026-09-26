/*
 * Copyright (c) 2026. Bernard Bou
 */
package com.bbou.coroutines.observe

import com.bbou.coroutines.observe.Formatter.formatAsString
import java.util.function.Consumer

/**
 * Task print observer
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
class TaskPrintObserver<Progress : Pair<Number, Number>> : Consumer<Progress> {

    /**
     * Consumer accept
     *
     * @param progress observed progress
     */
    override fun accept(progress: Progress) {
        val unit: String? = null
        val longProgress = progress.first.toLong()
        val longLength = progress.second.toLong()
        println(formatAsString(longProgress, longLength, unit))
    }
}
