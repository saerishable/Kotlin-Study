package `Chp3 - Defining and calling functions`

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button Clicked")
}

fun View.showOff() = println("This is View")
fun Button.showOff() = println("This is Button")

fun main() {
    val view: View = Button()

    view.click()
    view.showOff()

    val button = Button()
    button.showOff()
}