package javabin.kotlin.c_javainterop

data class KPerson(val firstName: String, val lastName: String, val company: String) {
    val email
        get() = "$firstName.$lastName@$company.com"
}