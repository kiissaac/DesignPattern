package observer.step0;

public class StatisticsDisplay implements Display{

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("===StatisticsDisplay===");
        System.out.println("Temperature : " + temperature);
        System.out.println("Humidity : " + humidity);
        System.out.println("Pressure : " + pressure);
        System.out.println("===StatisticsDisplay===");
    }
}
