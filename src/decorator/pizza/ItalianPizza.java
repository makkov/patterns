package decorator.pizza;

import decorator.Pizza;

public class ItalianPizza extends Pizza {

    public ItalianPizza() {
        description = "tomato and pasta";
    }

    @Override
    public double cost() {
        return 999.99;
    }
}
