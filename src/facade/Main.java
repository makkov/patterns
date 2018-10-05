package facade;

public class Main {

    public static void main(String[] args) {
        DishOrder dishOrder = new DishOrder("pizza");
        new PizzaCookFacade().cook(dishOrder);
    }
}
