package strategy.step1;

public class TestDuck {
    public static void main(String[] args) {

        Duck mld = new MallarDuck();
        Duck rhd = new RedheadDuck();
        Duck rbd = new RubberDuck();
        Duck dcd = new DecoyDuck();

        System.out.println("---------------------------");
        testDuck(mld);
        System.out.println("---------------------------");
        testDuck(rhd);
        System.out.println("---------------------------");
        testDuck(rbd);
        System.out.println("---------------------------");
        testDuck(dcd);
        System.out.println("---------------------------");

    }

    public static void testDuck(Duck d) {
        d.display();
        if (d instanceof Flyable) {
            ((Flyable) d).fly();
        }
        if (d instanceof Quackable) {
            ((Quackable) d).quack();
        }
        d.swim();
    }

}
