package ru.timmson.kotlin

data class Employee(val name: String, val phone: String) {
    companion object {
        @JvmStatic
        fun of(name: String, phone: String): Employee {
            return Employee(name, phone)
        }
    }
}
