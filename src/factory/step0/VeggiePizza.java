package factory.step0;

public class VeggiePizza extends Pizza{

    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara Sauce";
        toppings.add("Shredded Mozzarella");
        toppings.add("Parmesan");
    }
}
