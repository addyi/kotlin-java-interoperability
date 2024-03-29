package org.example

import org.example.accessor.Customer
import org.example.accessor.calendarDemo
import org.example.jinterface.JavaServiceInterface
import org.example.jinterface.KotlinImplForJavaInterface
import org.example.kinterface.JavaImplForKotlinInterface
import org.example.kinterface.KotlinServiceInterface
import org.example.sealed.UiState
import org.example.sealed.UiState.Loading

fun main() {
    println("Hello World")

    println("### KOTLIN SEALED CLASS ###")

    val loading = Loading
    val success = UiState.Success("Success message")
    val error = UiState.Error("Error message")

    println(loading)
    println(success)
    println(success.data)
    println(error)

    println("### JAVA INTERFACE ###")

    val javaInterface: JavaServiceInterface = KotlinImplForJavaInterface()

    javaInterface
        .doSomething("Hello")
        .also(::println)


    println("### KOTLIN INTERFACE ###")

    val kotlinInterface: KotlinServiceInterface = JavaImplForKotlinInterface()

    kotlinInterface
        .doSomething()
        .also(::println)

    println("### GETTER/SETTER ###")

    val customer = Customer("John Doe")

    println(customer.name)
    customer.name = "Jane Doe"
    println(customer.name)
    customer.placeOrder()

    println("### Top-level function ###")

    calendarDemo()

}
