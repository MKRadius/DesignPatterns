public abstract class Button {
    private String text;

    public Button(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public abstract void display();
}
