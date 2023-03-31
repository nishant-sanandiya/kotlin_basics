package com.example.kotlin_basics

fun main () {
    whileFun()
    forFun()
    println(avgFun(2, 3))
}

fun whileFun () {
    var a = 10
    while (a>=0){
//        println("${a}")
        a--
    }
}

fun forFun () {
    for (i in 0..10){
//        println("I :- ${i}")
    }

    for (i in 0..10 ){
        if(i==9){
            continue
        }
//        println("I :- ${i}")
        if(i==5){
//            break
        }
    }
}

fun avgFun (a :Int, b:Int ): Double = ((a+b)/2).toDouble()