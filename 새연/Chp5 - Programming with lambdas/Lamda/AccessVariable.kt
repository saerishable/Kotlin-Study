import com.sun.javafx.geom.Path2D.CornerPrefix
import javafx.scene.control.Button
import java.net.http.HttpResponse
import javax.sound.midi.MetaMessage

fun printMessageWithPrefix(message: Collection<String>, prefix: String) {
    message.forEach {
        print("$prefix: $it ")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}

fun countButtonClicks(button: Button): Int {
    var clicks = 0
//    button.onClick { clicks++}

    return clicks
}

fun main() {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors, "Error: ")

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}