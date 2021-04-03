package observer.step0;

import java.util.Random;
import java.util.RandomAccess;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    private Display currentConditionsDisplay;
    private Display statisticsDisplay;
    private Display forecastDisplay;

    public WeatherData(Display currentConditionsDisplay, Display statisticsDisplay, Display forecastDisplay) {
        this.currentConditionsDisplay = currentConditionsDisplay;
        this.statisticsDisplay = statisticsDisplay;
        this.forecastDisplay = forecastDisplay;
    }

    public  void measurementsChanged() {
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private float getPressure() {
        return random();
    }

    private float getHumidity() {
        return random();
    }

    private float getTemperature() {
        return random();
    }

    private float random() {
        return new Random().nextFloat();
    }
}
