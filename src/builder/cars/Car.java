package builder.cars;

import builder.components.Engine;
import builder.components.TripComputer;
import builder.components.Wheels;

public class Car {

    private final Engine engine;
    private final Wheels wheels;
    private final int weelQty;
    private final int capcity;
    private final TripComputer computer;

    public Car(Engine engine, Wheels wheels, int weelQty, int capcity, TripComputer computer) {
        this.engine = engine;
        this.wheels = wheels;
        this.weelQty = weelQty;
        this.capcity = capcity;
        this.computer = computer;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public int getWeelQty() {
        return weelQty;
    }

    public int getCapcity() {
        return capcity;
    }

    public TripComputer getComputer() {
        return computer;
    }
}
