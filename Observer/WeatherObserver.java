public class WeatherObserver implements Observer {
    private String name;
    private int temperature;

    
    public WeatherObserver(String name) {
        this.name = name;
        this.temperature = 0;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void update(int newTemperature) {
        this.temperature = newTemperature;
        System.out.println(name + " temperature: " + temperature);
    }
}
