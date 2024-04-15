package com.example.controller;

import java.util.EnumMap;
import java.util.Map;

import com.example.model.Tile.TileImage;
import com.example.model.Tile.TileType;

public class TileGraphicFactory {
    private static final Map<TileType, TileImage> images = new EnumMap<>(TileType.class);

    public static TileImage getTileImage(TileType type) {
        TileImage image = images.get(type);
        if (image == null) {
            System.out.println(type.name().toLowerCase() + ".png");
            image = new TileImage(type.name().toLowerCase() + ".png", type.getClass().getName());
            images.put(type, image);
        }
        return image;
    }
}
