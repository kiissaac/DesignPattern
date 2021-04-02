package strategy.step2;

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
        d.performFly();
        d.performQuack();
        d.swim();
    }

}
