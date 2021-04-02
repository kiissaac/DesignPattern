package strategy.step1;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("Duck > RubberDuck display");
    }

    @Override
    public void quack() {
        System.out.println("Bbick Bbick~~~");
    }
}
