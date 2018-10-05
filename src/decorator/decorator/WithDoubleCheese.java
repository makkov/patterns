package decorator.decorator;

import decorator.Decorator;
import decorator.Pizza;

public class WithDoubleCheese extends Decorator {

    private Pizza pizza;

    public WithDoubleCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", with double cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() + 50.50;
    }
}
