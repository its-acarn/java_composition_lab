package vehicles;

import vehicleComponents.Engine;
import vehicleComponents.Seats;
import vehicleComponents.Tyres;

public class ElectricCar extends Vehicle {

    public ElectricCar( String make, String model, double price, String colour, double damage) {
        super( make, model, price, colour, damage);
    }
}
