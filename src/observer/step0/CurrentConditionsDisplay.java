package observer.step0;

public class CurrentConditionsDisplay implements Display{

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("===CurrentConditionsDisplay===");
        System.out.println("Temperature : " + temperature);
        System.out.println("Humidity : " + humidity);
        System.out.println("Pressure : " + pressure);
        System.out.println("===CurrentConditionsDisplay===");
    }
}
