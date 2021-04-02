package strategy.step0;

public class TestDuck {
    public static void main(String[] args) {

        Duck mld = new MallarDuck();
        Duck rhd = new RedheadDuck();
        Duck rbd = new RubberDuck();
        Duck dcd = new DecoyDuck();

        System.out.println("---------------------------");
        testBeforeDuck(mld);
        System.out.println("---------------------------");
        testBeforeDuck(rhd);
        System.out.println("---------------------------");
        testBeforeDuck(rbd);
        System.out.println("---------------------------");
        testBeforeDuck(dcd);
        System.out.println("---------------------------");

    }

    public static void testBeforeDuck(Duck d) {
        d.display();
        d.quack();
        d.fly();
        d.swim();
    }

}
