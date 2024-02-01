public class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        for (int i = 0; i < this.getText().length() + 4; i++) {
            System.out.print("-");
        }
        
        System.out.println("\n[ ] " + this.getText());
        
        for (int i = 0; i < this.getText().length() + 4; i++) {
            System.out.print("-");
        }

        System.out.println("\n");
    }
}
