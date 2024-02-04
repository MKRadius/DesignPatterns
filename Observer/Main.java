public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        WeatherObserver observer1 = new WeatherObserver("Observer 1");
        WeatherObserver observer2 = new WeatherObserver("Observer 2");
        WeatherObserver observer3 = new WeatherObserver("Observer 3");

        // Add observers
        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);
        weatherStation.addObserver(observer3);

        // Start the weather station
        weatherStation.start();

        // Remove observer 3 after 10 seconds
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Remove observer 3
        weatherStation.removeObserver(observer3);
        System.out.println("Observer 3 removed");


        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        weatherStation.interrupt();

        // Print the temperature of each observer and see if observer3's temperature is not updated
        System.out.println(observer1.getName() + " final temperature: " + observer1.getTemperature());
        System.out.println(observer2.getName() + " final temperature: " + observer2.getTemperature());
        System.out.println(observer3.getName() + " final temperature: " + observer3.getTemperature());

        System.out.println("End of program");
    }
}
