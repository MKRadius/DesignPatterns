package com.example;

public class ConsoleControl {
    private GUI gui;

    public ConsoleControl(GUI gui) {
        this.gui = gui;
    }

    public void generateCode() {
        gui.generateCode();
    }
}
