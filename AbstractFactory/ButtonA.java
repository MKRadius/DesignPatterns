public class ButtonA extends Button {
    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void display() {
        int length = this.getText().length();

        for (int i = 0; i < length + 4; i++) {
            System.out.print("-");
        }

        System.out.print("\n| " + this.getText() + " |\n");

        for (int i = 0; i < length + 4; i++) {
            System.out.print("-");
        }

        System.out.println("\n");
    }
}
