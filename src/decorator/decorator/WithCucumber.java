package decorator.decorator;

import decorator.Pizza;

public class WithCucumber extends Pizza {

    private Pizza pizza;

    public WithCucumber(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", with fresh cucumber";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.50;
    }
}
