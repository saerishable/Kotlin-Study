import javax.swing.text.View

fun main() {
    val listener = OnClickListener { view ->
        val text = when (view.id) {
            R.id.button1 -> "first"
            R.id.button2 -> "second"
            else -> "unknown"
        }
        toast(text)
    }
}

class R {
    companion object {
        val id: Any = TODO()
    }

}

class OnClickListener(any: Any) {

}

fun toast(text: String) {
    TODO("Not yet implemented")
}

