package com.example.assignment.assignment2

import kotlin.random.Random

data class Item(val name: String) {
    var price: Int = 0
        set(value) {
            field = value
            println("price set to $value. Are you serious?")
        }

    var share: Int = 0

    init {
        println("$name item was created.")
    }
}

fun main() {
    val item = Item(name = "saeyeon").apply {
        share = 100
        price = 500
    }

    // question 4
    val itemList = mutableListOf<Item>()

    for (i in 1..10) {
        val item = Item(name = "saeyeon$i").apply {
            share = 100
            price = Random.nextInt(0, 1001)
        }
        itemList.add(item)
    }

    itemList.forEach { item ->
        println(item)
    }

    // question 5
    val expensiveItems = itemList.filter { it.price > 500 }

    println("Items with price higher than 500:")
    expensiveItems.forEach { item ->
        println(item)
    }

    // question 6
    val str = expensiveItems.run {
        sortedBy { it.price }
        joinToString(separator = "\n") { it.toString() }
    }.also {
        println(it.uppercase())
    }

    println("Sorted list as string:\n$str")
}
