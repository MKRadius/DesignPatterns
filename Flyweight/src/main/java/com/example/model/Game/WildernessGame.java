package com.example.model.Game;

import com.example.model.Map.*;

public class WildernessGame extends Game {
    @Override
    public Map createMap() {
        return new WildernessMap();
    }
}
