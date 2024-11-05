package design_pattern.behavior.observer;

public class Test {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);

        station.setTemperature(100);
        station.setPressure(200);
        station.setHumidity(300);
    }
}
