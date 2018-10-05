package builder.cars;

import builder.components.Engine;
import builder.components.TripComputer;
import builder.components.Wheels;

public class Moto {

    private final Engine engine;
    private final Wheels wheels;
    private final int weelQty;
    private final int capcity;
    private boolean sideSeat;

    public Moto(Engine engine, Wheels wheels, int weelQty, int capcity, boolean sideSeat) {
        this.engine = engine;
        this.wheels = wheels;
        this.weelQty = weelQty;
        this.capcity = capcity;
        this.sideSeat = sideSeat;
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

    public boolean isSideSeat() {
        return sideSeat;
    }

    public void setSideSeat(boolean sideSeat) {
        this.sideSeat = sideSeat;
    }
}
