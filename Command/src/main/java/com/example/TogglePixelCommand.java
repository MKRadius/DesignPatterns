package com.example;

public class TogglePixelCommand implements Command {
    private PixelControl pixel;

    public TogglePixelCommand(PixelControl pixel) {
        this.pixel = pixel;
    }
    
    @Override
    public void execute() {
        pixel.togglePixel();
    }
}
