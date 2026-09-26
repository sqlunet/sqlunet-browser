/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.speak

class LexUnit(val word: String, ipa: String, variety: String?) : Pronunciation(ipa, variety) {

    override fun toString(): String {
        return String.format("%s %s", word, super.toString())
    }
}
