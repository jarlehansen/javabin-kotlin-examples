package javabin.kotlin.k_extensionfunctions

fun String.palindrome() = (this == this.reversed())

fun main() {
    println("abc".palindrome())
    println("abccba".palindrome())
}