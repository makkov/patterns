package builder.components;

public class Engine {

    private boolean started;
    private final double volume;
    private double mileage;

    public Engine(boolean started, double volume, double mileage) {
        this.started = started;
        this.volume = volume;
        this.mileage = mileage;
    }

    public Engine() {
        this.started = true;
        this.volume = 0.0;
        this.mileage = mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
