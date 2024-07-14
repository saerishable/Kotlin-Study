package ClassLayer

class ViewButtonKotlin : View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) { /* ... */ }

    class ButtonState() : State { /* ... */ }
}

