package observer.step2;

import java.util.Random;


public class TestWeatherData {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(random(), random(), random());
        weatherData.deleteObserver(currentConditionsDisplay);
        weatherData.setMeasurements(random(), random(), random());
    }

    public static float random() {
        return new Random().nextFloat();
    }
}
