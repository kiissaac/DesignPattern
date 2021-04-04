package decorator.step0;

public class TestStarbuz {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast);
        darkRoast.setMilk(true);
        darkRoast.setSoy(true);
        darkRoast.setMocha(true);
        darkRoast.setWhip(true);
        System.out.println(darkRoast);

        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend);
    }
}
