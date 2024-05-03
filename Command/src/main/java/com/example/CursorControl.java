package com.example;

public class CursorControl {
    private GUI gui;

    public CursorControl(GUI gui) {
        this.gui = gui;
    }

    public void moveUp() {
        gui.moveCursorUp();
    }

    public void moveDown() {
        gui.moveCursorDown();
    }

    public void moveLeft() {
        gui.moveCursorLeft();
    }

    public void moveRight() {
        gui.moveCursorRight();
    }
}
