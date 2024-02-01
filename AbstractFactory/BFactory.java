public class BFactory extends UIFactory {
    @Override
    public Button createButton() {
        return new ButtonB();
    }

    @Override
    public TextField createTextField() {
        return new TextFieldB();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxB();
    }
}
