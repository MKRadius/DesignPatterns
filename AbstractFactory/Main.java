public class Main {
    public static void main(String[] args) {
        UIFactory factory = new AFactory();
        // UIFactory factory = new BFactory();

        Button button       = factory.createButton("Click me");
        TextField textField = factory.createTextField("Enter something here");
        Checkbox checkbox   = factory.createCheckbox("Mark this box");
        
        button.display();
        textField.display();
        checkbox.display();

        // Change the text of the components
        button.setText("New Button");
        textField.setText("New TextField");
        checkbox.setText("New Checkbox");

        button.display();
        textField.display();
        checkbox.display();
    }
}
