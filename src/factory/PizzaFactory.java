package factory;

public class PizzaFactory {

    Pizza createPizza(String pizzaTyoe) {
        switch (pizzaTyoe) {
            case "pepperony":
                return new PizzaPepperony(20, true);
            case "margarita":
                return new PizzaMargarita(false);
        }
        return null;
    }
}
