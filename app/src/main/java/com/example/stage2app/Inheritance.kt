package com.example.stage2app

fun main() {

    // Create car objects and assign it to myFirstCar and mySecondCar
    val myFirstCar = Car("Benz", "White")
    println(myFirstCar.doors)
    myFirstCar.cost()

    val mySecondCar = Car("Ferrari", "Red")
    println(mySecondCar.steeringWheels)
    mySecondCar.cost()
}

// Car class with color and name properties
open class Car(open val name: String, open val color: String) {

    // Properties
    val doors = 2
    val steeringWheels = 1

    // Cost function
    fun cost() {
        val cost = 5000000
        println(cost)
    }
}

class Bicycle(override val name: String, override val color: String) : Car("Bike", "Black")