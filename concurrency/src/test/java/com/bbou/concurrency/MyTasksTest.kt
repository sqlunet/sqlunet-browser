/*
 * Copyright (c) 2019-2026. Bernard Bou.
 */
package com.bbou.concurrency

import org.junit.Test

class MyTasksTest {

    /**
     * Test Task
     */
    @Test
    fun taskTest() {
        val t = MyBaseTask().execute(Parameters(25, 500))
        val r = t.get()
        println("done $r")
    }
}
