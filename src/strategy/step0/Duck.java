package strategy.step0;

public abstract class Duck {
    public void quack() {
        System.out.println("Quack Quack~~~");
    }

    public void swim() {
        System.out.println("Swim Swim~~~");
    }

    public void fly() {
        System.out.println("Fly Fly~~~");
    }

    public abstract void display();
}
