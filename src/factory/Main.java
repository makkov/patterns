package factory;

public class Main {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza("pepperony");
        System.out.println(pizza);
        Pizza pizza1 = pizzaFactory.createPizza("margarita1");
        System.out.println(pizza1);
    }
}
