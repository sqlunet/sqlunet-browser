/*
 * Copyright (c) 2026. Bernard Bou
 */
package com.bbou.donate.billing

import android.content.Context
import com.bbou.donate.R

/**
 * Static fields and methods useful for billing
 */
object Products {

    lateinit var inappProducts: Array<String>
        private set

    fun init(context: Context) {
        inappProducts = context.resources.getStringArray(R.array.skus)
    }
}
