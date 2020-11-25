package vehicles;

import vehicleComponents.Engine;
import vehicleComponents.Seats;
import vehicleComponents.Tyres;

public class Motorbike extends Vehicle {

    public Motorbike(Engine engine, Tyres tyres, Seats seats, String make, String model, double price, String colour) {
        super(engine, tyres, seats, make, model, price, colour);
    }
}
