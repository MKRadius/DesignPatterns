package com.example;

public class PixelWindowControl {
    private Command moveCursorUp;
    private Command moveCursorDown;
    private Command moveCursorLeft;
    private Command moveCursorRight;
    private Command togglePixel;
    private Command generateCode;

    public PixelWindowControl(Command moveCursorUp, Command moveCursorDown, Command moveCursorLeft, Command moveCursorRight, Command togglePixel, Command generateCode) {
        this.moveCursorUp = moveCursorUp;
        this.moveCursorDown = moveCursorDown;
        this.moveCursorLeft = moveCursorLeft;
        this.moveCursorRight = moveCursorRight;
        this.togglePixel = togglePixel;
        this.generateCode = generateCode;
    }

    public void moveCursorUp() {
        moveCursorUp.execute();
    }

    public void moveCursorDown() {
        moveCursorDown.execute();
    }

    public void moveCursorLeft() {
        moveCursorLeft.execute();
    }

    public void moveCursorRight() {
        moveCursorRight.execute();
    }

    public void togglePixel() {
        togglePixel.execute();
    }

    public void generateCode() {
        generateCode.execute();
    }
}
