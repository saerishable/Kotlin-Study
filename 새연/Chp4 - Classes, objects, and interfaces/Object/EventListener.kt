package Object

import java.awt.SystemColor.window
import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.event.MouseListener

class Window {
    fun addMouseListener(mouseListener: MouseListener) {

    }

}

fun main() {
    val window = Window()

    window.addMouseListener(
        object : MouseListener {
            override fun mouseClicked(e: MouseEvent?) {
                TODO("Not yet implemented")
            }

            override fun mousePressed(e: MouseEvent?) {
                TODO("Not yet implemented")
            }

            override fun mouseReleased(e: MouseEvent?) {
                TODO("Not yet implemented")
            }

            override fun mouseEntered(e: MouseEvent?) {
                TODO("Not yet implemented")
            }

            override fun mouseExited(e: MouseEvent?) {
                TODO("Not yet implemented")
            }
        }
    )
}

val listener = object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
    }

    override fun mouseEntered(e: MouseEvent?) {
        super.mouseEntered(e)
    }
}

fun countClicks(window: Window) {
    var clickCount = 0

    window.addWindowListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            clickCount++
        }
    })
}


