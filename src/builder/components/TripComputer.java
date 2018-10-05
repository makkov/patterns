package builder.components;

public class TripComputer {

    private double fuelVolume;

    public TripComputer(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }
}
