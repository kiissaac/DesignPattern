package observer.step1;

public class StatisticsDisplay implements Observer, Display {
    private float temperature;
    private float pressure;
    private float humidity;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("===StatisticsDisplay===");
        System.out.println("Temperature : " + temperature);
        System.out.println("Humidity : " + humidity);
        System.out.println("Pressure : " + pressure);
        System.out.println("===StatisticsDisplay===");
    }
}
