package com.example.kotlin_basics


fun main() {
    val personInstance = Person("Hii", 5)
    val person1Instance = Person1("Nishant", "Sanandiya", 20);
}

//Primary constructor :- written with class name
//Secondary constructor :- written into class with constructor keyword
//init block run before constructor.

class Person constructor(age: Int, age2: Int) {
    constructor(name: String, age3: Int) : this(6, age3) {
        println("Constructor called")
    }

    init {
        println("init called")
    }
}

public class Person1(
    val first_Name: String,
    val last_Name: String,
    val age_Number: Int,
) {
    public fun get_Fname(): String {
        return this.first_Name
    }

    public fun get_Lname(): String {
        return this.last_Name
    }

    public fun get_Age(): Int {
        return this.age_Number
    }
}