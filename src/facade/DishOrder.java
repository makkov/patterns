package facade;

public class DishOrder {

    private String name;

    public DishOrder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void cook() {
        System.out.println("cook the dish");
    }
}
