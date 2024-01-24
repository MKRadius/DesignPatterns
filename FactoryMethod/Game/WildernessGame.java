package Game;
import Map.Map;
import Map.WildernessMap;

public class WildernessGame extends Game {
    @Override
    public Map createMap() {
        return new WildernessMap();
    }
}
