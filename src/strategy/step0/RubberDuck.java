package strategy.step0;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Duck > RubberDuck display");
    }

    @Override
    public void quack() {
        System.out.println("Bbick Bbick~~~");
    }

    @Override
    public void fly() {
        System.out.println("No fly!!!");
    }
}
