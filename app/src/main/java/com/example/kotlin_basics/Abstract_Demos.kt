package com.example.kotlin_basics

fun main() {
    val testInstance = Test()
    testInstance.abstarctCount;
}

abstract class AbstractClass {
    abstract var abstarctCount: Int
    abstract fun abstractFun(name: String): String
}

class Test : AbstractClass() {
    override var abstarctCount = 25
    override fun abstractFun(name: String): String {
        println("Override Abstract Fun")
        return "Hii"
    }
}