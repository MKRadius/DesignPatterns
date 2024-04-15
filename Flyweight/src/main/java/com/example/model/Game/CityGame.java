package com.example.model.Game;

import com.example.model.Map.*;

public class CityGame extends Game {
    @Override
    public Map createMap() {
        return new CityMap();
    }
}
