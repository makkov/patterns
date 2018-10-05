package decorator.pizza;

import decorator.Pizza;

public class PizzaRussian extends Pizza {

    public PizzaRussian() {
        description = "kethenez";
    }

    @Override
    public double cost() {
        return 399.98;
    }
}
