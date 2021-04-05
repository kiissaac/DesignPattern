package factory.step0;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... " + dough);
        System.out.println("Adding sauce... " + sauce);
        System.out.println("Adding toppings... ");
        for (String topping:toppings) {
            System.out.println("Adding topping... " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking... " + name);
    }

    public void cut() {
        System.out.println("Cutting... " + name);
    }

    public void box() {
        System.out.println("Boxing... " + name);
    }

    public String getName() {
        return name;
    }
}
