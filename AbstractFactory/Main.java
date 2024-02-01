public class Main {
    public static void main(String[] args) {
        UIFactory factory = new BFactory();

        Button button       = factory.createButton("Button-A");
        TextField textField = factory.createTextField("TextField-A");
        Checkbox checkbox   = factory.createCheckbox("Checkbox-A");
        
        button.display();
        textField.display();
        checkbox.display();

        button.setText("New Button A");
        textField.setText("New TextField A");
        checkbox.setText("New Checkbox A");

        button.display();
        textField.display();
        checkbox.display();
    }
}
