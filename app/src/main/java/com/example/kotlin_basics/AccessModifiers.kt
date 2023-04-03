package com.example.kotlin_basics

open class Base() {
    var a = 1 // public by default
    private var b = 2 // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4 // visible inside the same module
    protected fun e() {} // visible to the Base and the Derived class
}

class Derived : Base() {
    // a, c, d, and e() of the Base class are visible
    // b is not visible
    override val c = 9 // c is protected
}


open class Vehicle {
}

open class Car : Vehicle {
    var car_name = "";

    constructor(name: String) {
        this.car_name = name
    }

    open fun CarName(): String {
        return this.car_name;
    }
}

class ElectricCar(name: String, brand: String) : Car(name) {
    override fun CarName (): String {
        return "Override Electric Car"
    }
}

fun main() {
    val base = Base()
    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible
    val derived = Derived()

    // derived.c is not visible


    val carInstance = Car("City")
    println(carInstance.CarName())

    val electricCarInstance = ElectricCar("City 2", "Honda")
    println(electricCarInstance.CarName())

}
