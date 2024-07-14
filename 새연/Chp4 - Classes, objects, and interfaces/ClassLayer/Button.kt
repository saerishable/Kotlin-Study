package ClassLayer

class Button : Clickable, Focusable {
    override fun click() = println("Clicked")

    //    override fun showOff() = super<Class.Clickable>.showOff()
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

