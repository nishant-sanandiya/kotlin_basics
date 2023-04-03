package com.example.kotlin_basics

// we just need to add keyword open in front of parent class by default it final.
/*
    All classes in Kotlin have a common superclass, Any,
    which is the default superclass for a class with no supertypes declared
*/
/*
    Any has three methods: equals(), hashCode(), and toString().
    Thus, these methods are defined for all Kotlin classes.
*/


/*
    we can use both constructor of parent class depends upon requirement.
*/

open class Parent {
    constructor(name: String, id: Int) {
    }

    constructor(name: String, id: Int, pass: String) {
    }
}

class Child : Parent {
    constructor(name: String, id: Int) : super(name, id) {
    }

    constructor(name: String, id: Int, pass: String) : super(name, id, "password") {
    }
}


open class BaseClass {
    var Base_Val = ""

    constructor(name: String) {
        this.Base_Val = name
    }

    fun getBaseValue(): String {
        return this.Base_Val;
    }
}

class DeriveClass(name: String) : BaseClass(name) {

}

fun main() {
    val instanceOfDerive = DeriveClass("ABC")
    println(instanceOfDerive.getBaseValue())

}