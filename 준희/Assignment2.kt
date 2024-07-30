package org.example

import kotlin.random.Random

fun grade() {
    val math = 100            // modify these scores for test
    val science = 90            // modify these scores for test
    val english = 80                  // modify these scores for test

    class Grade(math: Int, science: Int, english: Int) {
        fun average(): Int {
            return (math + science + english) / 3
        }
    }

    val me = Grade(math, science, english)


//    Log.d("ITM","my math: $math, my science: $science, my english: $english")
    println("my math: $math, my science: $science, my english: $english")
//    Log.d("ITM","Average is ${me.average()}")
    println("Average is ${me.average()}")
}

fun point() {
    open class Point(open var x: Int, open var y: Int) {
        fun move(x: Int, y: Int) {
            this.x = x //현재클래스의 x값이 move로 들어온 인자 x로 바뀌는 것
            this.y = y //현재클래스의 y값이 move로 들어온 인자 y로 바뀌는 것
        }

        open fun show() {
//            Log.d("HW01","Current Point: ($x, $y)")
            println("Current Point: ($x, $y)")
        }
    }

    open class ColorPoint(x: Int, y: Int, var color: String) :
        Point(x, y) {
        fun setPoint(x: Int, y: Int) {
            this.x = x
            this.y = y
        }

        override fun show() {
            println("Color: $color Current Point: ($x, $y)")
        }
        override var y: Int = 0//를 오버라이드 하면서 setter 설정
    }

    val p = Point(5, 5)
    p.x = 10
    p.y = 20
    p.show()

    val cp = ColorPoint(5, 5, "YELLOW")
    cp.setPoint(10, 20)
    cp.color = "GREEN"
    cp.y = 100
    cp.show()
    //y가 바꼈을때 바로 로그로 출력되게?
}

fun data() {
    open class Item(val name: String) {
        var price: Int = 0
            set(value) {
                field = value
                println("price set to [$value]. Are you serious?")
            }
        var share: Int = 0

        init {
            println("[$name] item was created.")
        }
    }

    val item1 = Item(name = "jinwoo1").apply {
        share = 100
        price = 500
    }
    val list = mutableListOf<Item>()
    for (i in 1..10) {
        val item = Item("juni$i").apply {
            share = 100
            price = Random.nextInt(0, 1000)
        }
        list.add(item)
    }
    list.forEach { item ->
        println("name: ${item.name} price: ${item.price}")
    }
    val mylist = list.filter { it.price > 500 }
    mylist.forEach { item ->
        println("name: ${item.name} price: ${item.price}")
    }
    val str = mylist.run {
        sortedBy { it.price }.joinToString(", ") { it.name }
    }.also {
        println(it.uppercase())
    }
}

fun sendemail() {
    fun sendEmail(address: String?) {
        if ((address == null) || !address.matches(Regex(".+@.+"))) {
            println("error")
        } else {
            println("complete")
        }
    }

    val address1 = "Nooooooo!!"
    val address2 = null
    val address3 = "jinw.jeong@seoultech.ac.kr"

    sendEmail(address1)
    sendEmail(address2)
    sendEmail(address3)
}

fun draw_pyramid(floor: Int) {
    val pyramid = StringBuilder().run {
        for (i in 1..floor) {
            append(" ".repeat(floor - i)).append("*".repeat(2 * i - 1)).append("\n")
        }
        toString()
    }
    println(pyramid)
}

class Product(val name: String, val price: Double)
class ShoppingCart {
    val oncart: MutableList<Product> = mutableListOf()
    var sum: Double = 0.0
    fun addProduct(product: Product) {
        oncart.add(product)
        sum += product.price
        println(oncart.joinToString(", ") { it.name })
    }

    fun calculateTotalPrice() {
        println(sum / oncart.size)
    }

    fun removeProduct(name: String) {
        val target = oncart.find { it.name == name }
        if (target != null) {
//            oncart.removeAll { Product::name == name }//이렇게하면 왜 하나만지워지지
            oncart.removeAll { it.name == name }
            sum -= target.price
            println("$name removed")
            println(oncart.joinToString(", ") { it.name })
        }
    }
}


fun shoppingcart() {
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
    cart.calculateTotalPrice()

    cart.removeProduct("Jean")
    cart.calculateTotalPrice()

    cart.removeProduct("Shoes")
    cart.calculateTotalPrice()
}

fun main() {
    grade()
    point()
    data()
    sendemail()
    draw_pyramid(5)
    shoppingcart()
}


// implement Grade class