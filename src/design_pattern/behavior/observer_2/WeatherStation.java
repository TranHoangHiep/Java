package design_pattern.behavior.observer_2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private int pressure;
    private int temperature;
    private int humidity;
    private List<Observer> observerList;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o : this.observerList) {
            o.update(pressure, temperature, humidity);
        }
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    


}
