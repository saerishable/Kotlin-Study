package com.example.assignment.assignment2

fun sendEmail1(address: String?) {
    val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()

    val validAddress = address ?: run {
        println("Error: Email address is null")
        return
    }

    if (!validAddress.matches(emailRegex)) {
        println("Error: '$validAddress' is not a valid email address")
        return
    }

    println("Sending email to $validAddress")
}

fun sendEmail2(address: String?) {
    val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()

    if (address == null) {
        println("Error: Email address is null")
        return
    }

    if (!address.matches(emailRegex)) {
        println("Error: '$address' is not a valid email address")
        return
    }

    println("Sending email to $address")
}

fun main() {
    val address1 = "Nooooooo!!"
    val address2 = null
    val address3 = "saeyeon0522@seoultech.ac.kr"

    sendEmail1(address1)
    sendEmail2(address1)

    sendEmail1(address2)
    sendEmail2(address2)

    sendEmail1(address3)
    sendEmail2(address3)
}

