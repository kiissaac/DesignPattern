package strategy.step1;

public class RedheadDuck extends Duck implements Quackable, Flyable {
    @Override
    public void display() {
        System.out.println("Duck > Redhead display");
    }

    @Override
    public void fly() {
        System.out.println("Fly Fly~~~");
    }

    @Override
    public void quack() {
        System.out.println("Quack Quack~~~");
    }
}
