package decorator.decorator;

import decorator.Decorator;
import decorator.Pizza;

public class WithJalapeno extends Decorator {

    private Pizza pizza;

    public WithJalapeno(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getDescription() {
        return pizza.getDescription() + ", with jalapeno";
    }

    @Override
    public double cost() {
        return pizza.cost() + 50.50;
    }
}
