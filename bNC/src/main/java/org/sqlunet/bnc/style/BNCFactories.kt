/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.bnc.style

import android.graphics.Typeface
import android.text.style.StyleSpan
import org.sqlunet.style.Factories
import org.sqlunet.style.Spanner

object BNCFactories {

    val headerFactory = Spanner.SpanFactory { _: Long -> Factories.spans(Colors.bncHeaderBackColor, Colors.bncHeaderForeColor, StyleSpan(Typeface.BOLD)) }
}
