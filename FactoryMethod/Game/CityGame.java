package Game;
import Map.CityMap;
import Map.Map;

public class CityGame extends Game {
    @Override
    public Map createMap() {
        return new CityMap();
    }
}
