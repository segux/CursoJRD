import accesories.types.WithAirConditioner;
import vehicles.Vehicle;
import vehicles.types.*;

public class Main {
    public static void main(String[] args) {
        Family familyCar = new Family();
        WithAirConditioner carWithExtras = new WithAirConditioner(familyCar);
        carWithExtras.hasAirConditioner();
    }
}