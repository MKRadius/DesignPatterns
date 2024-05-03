package com.example;

public class PixelControl {
    private GUI gui;

    public PixelControl(GUI gui) {
        this.gui = gui;
    }

    public void togglePixel() {
        gui.togglePixel();
    }
}
