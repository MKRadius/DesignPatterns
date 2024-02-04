import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation extends Thread {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;
    private final int MAX_TEMPERATURE = 50;
    private final int MIN_TEMPERATURE = -40;

    public WeatherStation() {
        this.temperature = new Random().nextInt(MAX_TEMPERATURE - MIN_TEMPERATURE + 1) + MIN_TEMPERATURE;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void run() {
        try {
            while (true) {
                if (new Random().nextBoolean()) {
                    temperature++;
                    if (temperature > MAX_TEMPERATURE) {
                        temperature = MAX_TEMPERATURE;
                    }
                } else {
                    temperature--;
                    if (temperature < MIN_TEMPERATURE) {
                        temperature = MIN_TEMPERATURE;
                    }
                }
    
                notifyObservers();
                Thread.sleep(new Random().nextInt(5000 - 1000 + 1) + 1000);
            }
        } 
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } 
    }
}
