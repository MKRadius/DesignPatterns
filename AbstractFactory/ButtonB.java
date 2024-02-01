public class ButtonB extends Button {
    public ButtonB(String text) {
        super(text);
    }

    @Override
    public void display() {
        int length = this.getText().length();

        for (int i = 0; i < length + 6; i++) {
            if (i == 0) {
                System.out.print("╔");
            } 
            else if (i == length + 5) {
                System.out.print("╗");
            }
            else {
                System.out.print("═");
            }
        }

        System.out.print("\n║  " + this.getText() + "  ║\n");

        for (int i = 0; i < length + 6; i++) {
            if (i == 0) {
                System.out.print("╚");
            } 
            else if (i == length + 5) {
                System.out.print("╝");
            }
            else {
                System.out.print("═");
            }
        } 
        
        System.out.println("\n");
    }
}
