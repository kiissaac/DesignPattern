package decorator.step1;

public class TestStarbuz {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast);
        Beverage withMilk = new Milk(darkRoast);
        Beverage withSoy = new Soy(withMilk);
        Beverage withMocha = new Mocha(withSoy);
        Beverage withWhip = new Whip(withMocha);
        System.out.println(withWhip);

        Beverage houseBlend = new HouseBlend();
        Beverage order = new Whip(new Whip(new Soy(houseBlend)));
        System.out.println(order);
    }
}
