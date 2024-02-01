public class TextFieldA extends TextField {
    public TextFieldA(String text) {
        super(text);
    }

    public void display() {
        int length = this.getText().length();

        System.out.print("+");
        for (int i = 1; i < length + 3; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < length + 4; i++) {
            if (i == 0 || i == length + 3) {
                System.out.print("|");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print("\n| " + this.getText() + " |\n");

        for (int i = 0; i < length + 4; i++) {
            if (i == 0 || i == length + 3) {
                System.out.print("|");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print("\n+");
        for (int i = 1; i < length + 3; i++) {
            System.out.print("-");
        }
        System.out.println("+\n");
    }
}
