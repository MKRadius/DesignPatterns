public abstract class Checkbox {
    private String text;

    public Checkbox(String text) {
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
