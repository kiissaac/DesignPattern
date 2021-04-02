package strategy.step0;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Duck > DecoyDuck display");
    }

    @Override
    public void quack() {
        System.out.println("No Quiet!!!");
    }

    @Override
    public void fly() {
        System.out.println("No fly!!!");
    }
}
