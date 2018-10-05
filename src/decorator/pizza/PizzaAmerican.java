package decorator.pizza;

import decorator.Pizza;

public class PizzaAmerican extends Pizza {

    public PizzaAmerican() {
        description = "all product American";
    }

    @Override
    public double cost() {
        return 99.8;
    }
}
