package com.example.assignment

class Product(val name: String, val price: Double)

class ShoppingCart {
    private val products = mutableListOf<Product>()

    fun addProduct(product: Product) {
        products.add(product)
    }

    fun removeProduct(productName: String) {
        products.removeAll { it.name == productName }
    }

    fun calculateTotalPrice(): Double {
        return products.sumOf { it.price }
    }
}

fun main() {
    val cart = ShoppingCart()

    val product1 = Product("Jean", 50.0)
    val product2 = Product("Jean", 100.0)
    val product3 = Product("Jean", 80.0)
    val product4 = Product("Shoes", 70.0)
    val product5 = Product("Pants", 90.0)
    val product6 = Product("GPU", 2000.0)

    cart.addProduct(product1)
    cart.addProduct(product2)
    cart.addProduct(product3)
    cart.addProduct(product4)
    cart.addProduct(product5)
    cart.addProduct(product6)
    println(cart.calculateTotalPrice()) // Should print total price of all products

    cart.removeProduct("Jean")
    println(cart.calculateTotalPrice()) // Should print total price after removing "Jean"

    cart.removeProduct("Shoes")
    println(cart.calculateTotalPrice()) // Should print total price after removing "Shoes"
}
