package strategy.step1;

public class MallarDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("Duck > MallarDuck display");
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
