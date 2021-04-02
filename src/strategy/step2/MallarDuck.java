package strategy.step2;

public class MallarDuck extends Duck {

    public MallarDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Duck > MallarDuck display");
    }
}
