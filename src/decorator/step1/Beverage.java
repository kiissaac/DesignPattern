package decorator.step1;

public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();

    public String toString() {
        return getDescription() + " Cost is $" + cost();
    }
}
