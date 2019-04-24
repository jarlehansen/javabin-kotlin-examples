package javabin.kotlin.f_when

fun main() {
    val numberOfSidesInASquare = 4

    when (numberOfSidesInASquare) {
        0 -> println("I bet you aced math in school ;)")
        4 -> println("Obviously...")
        else -> println("")
    }
}