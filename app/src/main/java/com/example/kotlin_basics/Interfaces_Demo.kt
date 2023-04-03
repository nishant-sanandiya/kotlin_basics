package com.example.kotlin_basics

fun main() {
    val CarInstance = CarWithInterface();
    println(CarInstance.distanceCount());
    CarInstance.staticDistanceCount();
    CarInstance.staticDistanceCount(56)
    CarInstance.breakFun()
}

interface Drive {
    val speed: Number
    fun distanceCount(): Number
    fun staticDistanceCount() {
        println("Static Distance Count")
    }

    fun breakFun() {
        println("Super break")
    }
}

class CarWithInterface : Drive {
    override val speed = 30
    override fun distanceCount(): Number {
        return 50.3
    }

    override fun breakFun() {
        super.breakFun()
        println("Sub break")
    }

    open fun staticDistanceCount(count: Int) {
        println("Static Distance Count :- ${count.toString()}")
    }

}