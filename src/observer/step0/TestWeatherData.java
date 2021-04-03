package observer.step0;

import java.util.Random;

public class TestWeatherData {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new CurrentConditionsDisplay(), new StatisticsDisplay(), new ForecastDisplay());
        weatherData.setMeasurements(random(), random(), random());
    }

    public static float random() {
        return new Random().nextFloat();
    }
}
