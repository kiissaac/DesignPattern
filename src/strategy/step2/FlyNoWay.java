package strategy.step2;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No Fly!!!");
    }
}
