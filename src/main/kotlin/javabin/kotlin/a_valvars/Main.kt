package javabin.kotlin.a_valvars

fun main() {
    val numberOfSidesInASquare: Int = 4

    val iAmConstant = "final"
    var iCanChange = 1

    // iAmConstant = 3   // compiler error because of type-change and re-assignment
    iCanChange = 4    // legal
    // iCanChange = "no" // compiler error due to type-change
}
