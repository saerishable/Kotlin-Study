import javax.swing.text.View;

public class Button {
    public void setOnClickListener(OnClickListener listener) { /* ... */}
}

class ButtonImpl {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}