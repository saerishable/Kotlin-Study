package ClassLayer

public open class TalkativeButton : Focusable {
    fun yell() = println("Hey")
    fun whisper() = println("Let's talk")
}

fun TalkativeButton.giveSpeech() {
    yell()
    whisper()
}