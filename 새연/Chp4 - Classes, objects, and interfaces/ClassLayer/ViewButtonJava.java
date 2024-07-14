package ClassLayer;

import org.jetbrains.annotations.NotNull;

public class ViewButtonJava implements View {
    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) { /* ... */ }

    public static class ButtonState implements State { /* ... */ }
}
