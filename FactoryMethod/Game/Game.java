package Game;
import Map.Map;

public abstract class Game {
    public void main() {
        Map map = createMap();
        map.createTile();
        map.display();
    }

    public abstract Map createMap();
}
