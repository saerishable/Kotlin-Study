import javax.swing.text.View

fun main() {
    var button: Button ?= null

    if (button != null) {
        button.setOnClickListener{ view -> /* ... */ }
    }

//    val listener = OnClickListener { view ->
//        val text = when (view.id) {
//            R.id.button1 -> "first"
//            R.id.button2 -> "second"
//            else -> "unknown"
//        }
//        toast(text)
//    }
}