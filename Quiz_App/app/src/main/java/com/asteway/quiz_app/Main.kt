package com.asteway.quiz_app

import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val score = 0
        val alertMessage = if (score > 0) """
     Congratulations! You submitted on current date
     and time, Your achieved 50%
     """.trimIndent() else "You failed the quiz! Please, try again."
    }
}