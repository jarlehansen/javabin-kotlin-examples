package javabin.kotlin.j_nullability

data class Address(val streetName: String?)
data class Person(val name: String, val address: Address?)

fun main() {
    // Kotlin differentiates between nullable and non-nullable types
    // all types so far has been non-nullable
    var iCanBeNull: Int? = 2
    var iCanAlsoBeNull: String? = null

    // assume we have a class Person with an address object as a child.
    // Both address and Person can be null.
    val person = Person("Per", Address("veien 1"))
    val displayAddress = person.address?.streetName ?: "none"

}