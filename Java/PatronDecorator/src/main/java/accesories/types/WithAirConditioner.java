package accesories.types;

import accesories.WithExtra;
import vehicles.Vehicle;

public class WithAirConditioner extends WithExtra {

    public WithAirConditioner(Vehicle vehicle) {
        super(vehicle);
    }

    public void hasAirConditioner() {
        System.out.println("I have air conditioner!");
    }
}
