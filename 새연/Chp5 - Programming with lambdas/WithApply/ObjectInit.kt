import javax.naming.Context

fun createViewWithCustomAttributes(context: Context) =
    TextView(context).apply {
        text = "sample"
        textSize = 20.0
        setPadding(10, 0, 0, 0)
    }