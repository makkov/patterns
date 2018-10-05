package facade;

public class PizzaCookFacade {
    public void cook(DishOrder dishOrder) {
//        DishOrder dishOrder = new DishOrder("pizza");
        OrderReceiver orderReceiver = new OrderReceiver();
        if (orderReceiver.acceptOrder(dishOrder.getName())) {
            PizzaCooker pizzaCooker = new PizzaCooker();
            if (pizzaCooker.cookPizza(dishOrder.getName())) {
                Delivery delivery = new Delivery();
                if (delivery.deliverDish()) {
                    System.out.println("This is your pizza");
                    return;
                }
            }
        }
        System.out.println("Have no pizza");

    }
}
