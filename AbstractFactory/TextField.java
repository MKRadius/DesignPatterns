public abstract class TextField {
    private String text;

    public TextField(String text) {
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