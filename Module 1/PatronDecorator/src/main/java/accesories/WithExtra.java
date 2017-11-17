package accesories;

import vehicles.Vehicle;

public abstract class WithExtra extends Vehicle {
    private Vehicle vehicle;

    public WithExtra(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
