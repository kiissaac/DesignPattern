package decorator.step0;

public class Beverage {
    protected String description = "Unknown Beverage";

    boolean milk = false;
    boolean soy = false;
    boolean mocha = false;
    boolean whip = false;

    private double milkCost = 0.1;
    private double soyCost = 0.15;
    private double mochaCost = 0.2;
    private double whipCost = 0.1;

    public String getDescription() {
        return this.description;
    }

    public double cost() {
        double condimentCost = 0.0;
        if(hasMilk()) condimentCost += milkCost;
        if(hasSoy()) condimentCost += soyCost;
        if(hasMocha()) condimentCost += mochaCost;
        if(hasWhip()) condimentCost += whipCost;
        return condimentCost;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    private boolean hasMilk() {
        return milk;
    }

    private boolean hasSoy() {
        return soy;
    }

    private boolean hasMocha() {
        return mocha;
    }

    private boolean hasWhip() {
        return whip;
    }

    public String toString() {
        return getDescription() + " Cost is $" + cost();
    }
}
