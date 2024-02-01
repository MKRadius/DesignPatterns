public class AFactory extends UIFactory {
    @Override
    public Button createButton() {
        return new ButtonA();
    }

    @Override
    public TextField createTextField() {
        return new TextFieldA();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxA();
    }

}
