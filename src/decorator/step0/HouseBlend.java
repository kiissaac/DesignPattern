package decorator.step0;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89+ super.cost();
    }
}
