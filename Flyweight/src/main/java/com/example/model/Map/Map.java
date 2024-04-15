package com.example.model.Map;

import javafx.scene.image.Image;

public interface Map {
    public void createTile();
    public void display();
    public int getWidth();
    public int getHeight();
    public Image getTileImage(int x, int y);
}
