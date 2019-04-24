package javabin.kotlin.i_immutability


fun main() {
    val computers = listOf("Commodore 64", "ZX Spectrum", "Amiga 500", "Atari 800")
    val computersThatContainsNumber = computers.filter {
        it.contains(Regex("\\d"))
    }
    println(computersThatContainsNumber)

    listOf(1, 3, 4, 5).map {
        it * 2
    }.forEach {
        println("Number: $it")
    }


    val values = mutableListOf("a", "b").apply { add("c") }
println(values)
}
